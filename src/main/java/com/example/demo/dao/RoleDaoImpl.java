package com.example.demo.dao;


import com.example.demo.dao.interfaces.RoleDao;
import com.example.demo.entity.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Cagy on 10/17/2017.
 */
public class RoleDaoImpl implements RoleDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Role role) {
        entityManager.persist(role);
    }

    /*@Override
    public void delete(Role role) {
        entityManager.remove(role);
    }*/

    @Override
    public void deleteById(int id_contact) {

    }

    @Override
    public Role update(Role entity) {
        return null;
    }

    @Override
    public Role getById(int id) {
        return null;
    }

    @Override
    public Role getRoleByName(String name) {
        return entityManager.createQuery("SELECT r FROM role r WHERE name =:name", Role.class)
                .setParameter("name",name).getSingleResult();
    }

    /*@Override
    public Users getUsersById(int id) {
        return entityManager.createQuery("SELECT u FROM Users u WHERE id=:id", Users.class)
                .setParameter("id", id)
                .getSingleResult();
    }*/
}
