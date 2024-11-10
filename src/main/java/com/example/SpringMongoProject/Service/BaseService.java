package com.example.SpringMongoProject.Service;

import java.util.Optional;

public interface BaseService<T, ID> {
    void saveOrUpdate(T entity);
    Iterable<T> listAll();
    Optional<T> getById(ID id);
    void deleteById(ID id);
}
