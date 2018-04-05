package com.example.demo.dao;


import com.example.demo.dao.interfaces.RoleDao;
import com.example.demo.entity.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Oleksandr Chekalenko on 4/3/2018.
 */
public class RoleDaoImpl implements RoleDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Role role) {
        entityManager.persist(role);
    }

    @Override
    public void deleteById(int id_contact) {  }

    @Override
    public Role update(Role entity) {
        return null;
    }

    @Override
    public Role getById(int id) {
        return null;
    }

}
