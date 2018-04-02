package com.example.demo.service.interfaces;

import com.example.demo.entity.Contacts;

/**
 * Created by Cagy on 11/23/2017.
 */
public interface IService<T> {
    void save(T entity);

    //T getByNumber(long number);

    T getById(int id);


   void deleteContact(int id);

    void update(T entity);

}
