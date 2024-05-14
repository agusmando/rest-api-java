package com.itcsoluciones.pruebaapirest.services;

import com.itcsoluciones.pruebaapirest.entities.Base;
import com.itcsoluciones.pruebaapirest.repositories.BaseRepository;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepo) {
        this.baseRepository = baseRepo;
    }

    @Override
    @Transactional
    public List<E> getAll() throws Exception {
        try {
            return baseRepository.findAll();
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E getById(ID id) throws Exception {
        try {
            return baseRepository.getReferenceById(id);
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            return baseRepository.save(entity);
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(E entity, ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            E entityUpda
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public void deleteById(ID id) throws Exception;
}
