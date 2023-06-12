package com.ecommerceproj.abstract_classes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public abstract class AbstractService<T> {

    @Autowired
    private AbstractRepository<T> repo;

    public List<T> listAll() {
        return repo.findAll();
    }

    public void save(T t) {
        repo.save(t);
    }

    public T get(long id) {
        Optional<T> optional = repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        throw new RuntimeException(" Vehicle not found for id :: " + id);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}