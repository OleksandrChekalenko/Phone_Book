package com.example.demo.dao.interfaces;

import com.example.demo.entity.Contacts;

import java.util.List;

/**
 * Created by Oleksandr Chekalenko on 4/2/2018.
 */
public interface ContactsDao extends IDAO<Contacts> {

    List<Contacts> getAll(int user);
}
