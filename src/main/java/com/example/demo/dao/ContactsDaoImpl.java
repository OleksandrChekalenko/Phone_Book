package com.example.demo.dao;

import com.example.demo.dao.interfaces.ContactsDao;
import com.example.demo.dao.interfaces.IDAO;
import com.example.demo.entity.Contacts;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Oleksandr Chekalenko on 4/2/2018.
 */
public class ContactsDaoImpl implements ContactsDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Contacts contacts) {
        entityManager.persist(contacts);
    }

    @Override
    @Transactional
    public void deleteById(int id_contact) {
        entityManager.remove(getById(id_contact));

    }

    @Override
    @Transactional
    public Contacts update(Contacts contact) {
        return entityManager.merge(contact);
    }

    @Override
    public Contacts getById(int id) {
        return entityManager.createQuery("SELECT c from Contacts c WHERE id_contact =" + id, Contacts.class)
                .getSingleResult();
    }

    @Override
    public List<Contacts> getAll(int user) {
        return entityManager.createQuery("SELECT c from Contacts c where user_id  = " + user, Contacts.class)
                                    .getResultList();
    }

}
