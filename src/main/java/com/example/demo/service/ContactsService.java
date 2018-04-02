package com.example.demo.service;

import com.example.demo.entity.Contacts;

import java.util.List;

/**
 * Created by Cagy on 4/2/2018.
 */
public interface ContactsService extends IService<Contacts> {

    List<Contacts> getAll(int user);

}
