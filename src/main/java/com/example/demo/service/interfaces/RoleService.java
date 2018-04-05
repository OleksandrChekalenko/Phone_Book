package com.example.demo.service.interfaces;


import com.example.demo.entity.Role;

/**
 * Created by Oleksandr Chekalenko on 4/3/2018.
 */
public interface RoleService extends IService<Role>{



    void delete(String name);

    //Role getRoleByName(String name);
}
