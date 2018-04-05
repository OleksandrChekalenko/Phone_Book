package com.example.demo.service;


import com.example.demo.dao.interfaces.RoleDao;
import com.example.demo.entity.Role;
import com.example.demo.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Oleksandr Chekalenko on 4/3/2018.
 */

public class RoleServiceImpl implements RoleService {


    @Autowired
    private RoleDao roleDao;

    public void save(Role role) {
        roleDao.save(role);
    }

}
