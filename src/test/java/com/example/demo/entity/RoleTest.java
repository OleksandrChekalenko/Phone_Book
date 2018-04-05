package com.example.demo.entity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Oleksandr Chekalenko on 4/4/2018.
 */
public class RoleTest {

    private Role role = new Role("RoleTest", "ROLE_USER");
    private String tmpS = "Admin";
    private int tmpI = 1;

    @Test
    public void getId() throws Exception {
        setId();
        assertEquals(tmpI, role.getId());
    }

    @Test
    public void setId() throws Exception {
        role.setId(tmpI);
        assertEquals(tmpI, role.getId());
    }

    @Test
    public void getName() throws Exception {
        setName();
        assertEquals(tmpS, role.getName());
    }

    @Test
    public void setName() throws Exception {
        role.setName(tmpS);
        assertEquals(tmpS, role.getName());
    }

    @Test
    public void getRole() throws Exception {
        setRole();
        assertEquals(tmpS, role.getRole());
    }

    @Test
    public void setRole() throws Exception {
        role.setRole(tmpS);
        assertEquals(tmpS, role.getRole());
    }

}