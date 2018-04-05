package com.example.demo.service.interfaces;

import com.example.demo.entity.Contacts;

import java.util.List;

/**
 * Created by Oleksandr Chekalenko on 4/3/2018.
 */
public interface IService<T> {

    void save(T entity);

    T getById(int id);

    void deleteContact(int id);

    void update(T entity);

}
