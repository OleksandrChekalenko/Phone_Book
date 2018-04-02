package com.example.demo.dao;

import com.example.demo.dao.interfaces.ContactsDao;
import com.example.demo.dao.interfaces.IDAO;
import com.example.demo.entity.Contacts;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Cagy on 4/2/2018.
 */
public class ContactsDaoImpl implements ContactsDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Contacts contacts) {
        entityManager.persist(contacts);
    }

    @Override
    public void delete(Contacts entity) {

    }

    @Override
    public Contacts update(Contacts entity) {
        return null;
    }

    @Override
    public List<Contacts> getAll(int user) {
        return entityManager.createQuery("SELECT c from Contacts c where user_id  = " + user, Contacts.class)

                                    .getResultList();
    }
}
