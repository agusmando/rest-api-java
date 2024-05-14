package com.itcsoluciones.pruebaapirest.services;

import com.itcsoluciones.pruebaapirest.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {

    public List<E> getAll() throws Exception;
    public E getById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(E entity, ID id) throws Exception;
    public void deleteById(ID id) throws Exception;

}
