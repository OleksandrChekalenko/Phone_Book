package com.example.demo.dao;

import com.example.demo.entity.Role;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oleksandr Chekalenko on 4/5/2018.
 */

@SpringBootTest
public class RoleDaoImplTest {

    private Role role;

    @Test
    public void save() throws Exception {
        role = new Role("roleSave", "ROLE_ADMIN");
        assertEquals(role, role);
    }

}