package com.example.demo.dao;

import com.example.demo.dao.interfaces.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.UserService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



public class UserDaoImplTest {

    @Autowired
    private UserService userService;

    @Autowired
    private static UserDaoImpl mockedUserDao;
    private static User user1;
    private static User user2;

    @BeforeClass
    public static void setUp() {
        mockedUserDao = mock(UserDaoImpl.class);

        user1 = new User("444444", "111111", "444 444 444");
        user1 = new User("555555", "111111", "555 555 555");

        when(mockedUserDao.getAll()).thenReturn(Arrays.asList(user1, user2));
        when(mockedUserDao.getUserByLogin("44444")).thenReturn(user1);
        when(mockedUserDao.update(user2)).thenReturn(user2);
        when(mockedUserDao.getById(1)).thenReturn(null);
    }

    @Test
    public void save() throws Exception {
    }

    @Test
    public void deleteById() throws Exception {
        //empty
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void getById() throws Exception {
        assertEquals(null, mockedUserDao.getById(1));
    }

    @Test
    public void getAll() throws Exception {
        List<User> allUsers = mockedUserDao.getAll();
        assertEquals(2, allUsers.size());
    }

    @Test
    public void getUsersById() throws Exception {
        //empty
    }

    @Test
    public void getUserByLogin() throws Exception {
    }

}
