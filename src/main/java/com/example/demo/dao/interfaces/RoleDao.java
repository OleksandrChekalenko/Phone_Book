package com.example.demo.dao.interfaces;


import com.example.demo.entity.Role;

/**
 * Created by Cagy on 10/17/2017.
 */
public interface RoleDao extends IDAO<Role> {

    Role getRoleByName(String name);
}
