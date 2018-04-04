package com.example.demo.service.interfaces;

import com.example.demo.entity.Contacts;

import java.util.List;

/**
 * Created by Cagy on 11/23/2017.
 */
public interface IService<T> {

    void save(T entity);

    List<T> sortContactsByName(List<T> list);
    List<T> sortContactsBySurName(List<T> list);
    List<T> sortContactsByNumber(List<T> list);

    T getById(int id);

    void deleteContact(int id);

    void update(T entity);

}
