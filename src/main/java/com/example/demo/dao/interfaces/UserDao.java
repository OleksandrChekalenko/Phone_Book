package com.example.demo.dao.interfaces;

import com.example.demo.entity.User;
import java.util.List;

public interface UserDao extends IDAO<User> {



    List<User> getAll();

    User getUserByLogin(String name);


}
