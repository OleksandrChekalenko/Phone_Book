package com.example.demo.dao.interfaces;

import com.example.demo.entity.User;
import java.util.List;

public interface UserDao extends IDAO<User> {

   // void save(Users user);

    //void delete(Users entity);

    //Users update(Users user);

    List<User> getAll();

    User getUsersById(int id);

    User getUserByLogin(String name);


}
