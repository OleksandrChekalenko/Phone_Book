package com.example.demo.service;


import com.example.demo.entity.Role;

/**
 * Created by Cagy on 10/17/2017.
 */
public interface RoleService extends IService<Role>{

    //void save(Role role);

    void delete(String name);

    Role getRoleByName(String name);
}
