package com.example.demo.service;

import com.example.demo.dao.interfaces.ContactsDao;
import com.example.demo.dao.interfaces.IDAO;
import com.example.demo.entity.Contacts;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Cagy on 4/2/2018.
 */
public class ContactsServiceImpl implements ContactsService {

    @Autowired
    public ContactsDao contactsDao;

    @Override
    public void save(Contacts contacts) {
        contactsDao.save(contacts);
    }

    @Override
    public List<Contacts> getAll(int user) {
        return contactsDao.getAll(user);
    }
}
