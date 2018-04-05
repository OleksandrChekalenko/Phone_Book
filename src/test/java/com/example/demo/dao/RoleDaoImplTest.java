package com.example.demo.dao;

import com.example.demo.dao.interfaces.RoleDao;
import com.example.demo.entity.Role;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

/**
 * Created by Oleksandr Chekalenko on 4/5/2018.
 */

@SpringBootTest
public class RoleDaoImplTest {

    @Autowired
    private RoleDao roleDao;
    private Role role;

    @Test
    public void save() throws Exception {
        role = new Role("roleSave", "ROLE_ADMIN");
        assertEquals(role, role);
    }

    @Test
    public void deleteById() throws Exception {
        role = new Role("roleSave", "ROLE_ADMIN");
        assertEquals(null, null);
    }

    @Test
    public void update() throws Exception {
        role = new Role("roleSave", "ROLE_ADMIN");
        assertEquals(null, null);
    }
}