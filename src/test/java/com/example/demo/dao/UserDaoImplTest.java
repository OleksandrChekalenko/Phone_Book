package com.example.demo.dao;

import com.example.demo.Application;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.UserService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDaoImplTest {

    private User user;

    @Autowired
    private UserService userService;

    @Test
    public void save() throws Exception {
        user = new User("testSave", "111111", "snp");
        userService.save(user);
        assertEquals(user, user);
    }

    @Test
    public void update() throws Exception {
        user = new User("testUpdate", "111111", "snp");
        User userOrig = user;
        user.setLogin("testUpdate2");
        userService.update(user);
        assertEquals(userOrig.getId_user(), 0);
    }

    @Test
    public void getById() throws Exception {
        user = userService.getById(1);
        assertEquals(null, user);
    }

    @Test
    public void getAll() throws Exception {
        List<User> userList = userService.getAll();
        assertEquals(userList, userList);
    }

    @Test
    public void getUserByLogin() throws Exception {
        user = new User("getUserByLogin", "111111", "snpsnpsnp");
        userService.save(user);
        assertEquals(user, user);
    }

}
