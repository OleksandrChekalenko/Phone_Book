package com.example.demo.service.interfaces;

import com.example.demo.entity.User;


import java.util.List;

public interface UserService extends IService<User> {

    User getById(int id);

    User getUserByLogin(String login);

    List<User> getAll();

    //void save(Users user);

    void delete(int id);

    void update(User user);
}
