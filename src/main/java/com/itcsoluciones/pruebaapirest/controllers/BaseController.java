package com.itcsoluciones.pruebaapirest.controllers;

import com.itcsoluciones.pruebaapirest.entities.Base;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseController <E extends Base, ID extends Serializable> {
    ResponseEntity<E> getById(ID id);
    ResponseEntity<List<E>> getAll();
    ResponseEntity<E> save(E entity);
    ResponseEntity<E> updateById(E entity, ID id);
    ResponseEntity<?> deleteById(ID id);
}

