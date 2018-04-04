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
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User getUserByLogin(String login) {
        return userDao.getUserByLogin(login);
    }

    @Override
    public List<User> sortContactsByName(List<User> list) {
        return null;
    }

    @Override
    public List<User> sortContactsBySurName(List<User> list) {
        return null;
    }

    @Override
    public List<User> sortContactsByNumber(List<User> list) {
        return null;
    }

    @Override
    public void delete(int id) {
        userDao.deleteById(id);
    }
    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public void deleteContact(int id) {
    }

}
