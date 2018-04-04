package com.example.demo.dao.interfaces;

/**
 * Created by Cagy on 11/23/2017.
 */
public interface IDAO<T> {

    void save(T entity);

    void deleteById(int entity);


    T update(T entity);

    T getById(int id);
}
