package com.example.demo.dao.interfaces;

/**
 * Created by Oleksandr Chekalenko on 4/3/2018.
 */
public interface IDAO<T> {

    void save(T entity);

    void deleteById(int entity);

    T update(T entity);

    T getById(int id);
}
