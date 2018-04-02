package com.example.demo.service;

import com.example.demo.entity.User;


import java.util.List;

public interface UserService extends IService<User> {

    User getById(int id);

    User getUserByName(String name);
    User getUserByLogin(String login);

    List<User> getAll();

    List<User> sortUsersById(List<User> usersList);
    List<User> sortUsersByName(List<User> usersList);
    List<User> sortUsersByFirstName(List<User> usersList);
    List<User> sortUsersByEmail(List<User> usersList);

    //void save(Users user);

    void delete(int id);

    void update(User user);
}
