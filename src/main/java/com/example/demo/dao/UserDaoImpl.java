package com.example.demo.dao;

import com.example.demo.dao.interfaces.UserDao;
import com.example.demo.entity.User;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Cagy on 4/2/2018.
 */
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(User user) {
    entityManager.persist(user);
    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getUsersById(int id) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        return entityManager.createQuery("SELECT u from User u where login = '" + login + "'", User.class)
                .getSingleResult();
    }
}
