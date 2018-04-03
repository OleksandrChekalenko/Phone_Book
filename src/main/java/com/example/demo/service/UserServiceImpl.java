package com.example.demo.service;

import com.example.demo.dao.interfaces.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Cagy on 4/2/2018.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public void deleteContact(int id) {

    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        return userDao.getUserByLogin(login);
    }


    @Override
    public List<User> sortUsersById(List<User> usersList) {
        return null;
    }

    @Override
    public List<User> sortUsersByName(List<User> usersList) {
        return null;
    }

    @Override
    public List<User> sortUsersByFirstName(List<User> usersList) {
        return null;
    }

    @Override
    public List<User> sortUsersByEmail(List<User> usersList) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
