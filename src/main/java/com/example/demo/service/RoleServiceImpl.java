package com.example.demo.service;


import com.example.demo.dao.interfaces.RoleDao;
import com.example.demo.entity.Role;
import com.example.demo.service.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Oleksandr Chekalenko on 4/3/2018.
 */

public class RoleServiceImpl implements RoleService {


    @Autowired
    private RoleDao roleDao;

    @Override
    public void save(Role role) {
        roleDao.save(role);

    }

    @Override
    public List<Role> sortContactsByName(List<Role> list) {
        return null;
    }

    @Override
    public List<Role> sortContactsBySurName(List<Role> list) {
        return null;
    }

    @Override
    public List<Role> sortContactsByNumber(List<Role> list) {
        return null;
    }

    @Override
    public Role getById(int id) {
        return null;
    }

    @Override
    public void deleteContact(int id) {

    }

    @Override
    public void update(Role entity) {

    }


    @Transactional
    public void delete(String name) {
        //roleDao.deleteById(roleDao.getRoleByName(name));
    }

    /*@Override
    public Role getRoleByName(String name) {
        return roleDao.getRoleByName(name);
    }
*/}
