package com.example.demo.service;

import com.example.demo.dao.interfaces.ContactsDao;
import com.example.demo.entity.Contacts;
import com.example.demo.service.interfaces.ContactsService;
import com.example.demo.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Comparator;
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
    public List<Contacts> sortContactsByName(List<Contacts> list) {
        Collections.sort(list, Comparator.comparing(Contacts::getName));
        return list;
    }

    @Override
    public List<Contacts> sortContactsBySurName(List<Contacts> list) {
        Collections.sort(list, Comparator.comparing(Contacts::getSurName));
        return list;
    }

    @Override
    public List<Contacts> sortContactsByNumber(List<Contacts> list) {
        Collections.sort(list, Comparator.comparing(Contacts::getMobileNumber));
        return list;
    }

    @Override
    public Contacts getById(int id) {
        return contactsDao.getById(id);
    }

    @Override
    @Transactional
    public void deleteContact(int id) {
        contactsDao.deleteById(id);
    }

    @Override
    @Transactional
    public void update(Contacts contact) {
        contactsDao.update(contact);
    }

    @Override
    public List<Contacts> getAll(int user) {
        return contactsDao.getAll(user);
    }

}
