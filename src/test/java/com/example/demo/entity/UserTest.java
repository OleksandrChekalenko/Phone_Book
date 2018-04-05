package com.example.demo.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Oleksandr Chekalenko on 4/4/2018.
 */
public class UserTest {

    private User userTest = new User();
    private  int tmpI = 1;
    private String tmpS = "test";
    private List<Contacts> contactsList = new ArrayList<>();


    @Test
    public void setId_user() throws Exception {
        userTest.setId_user(tmpI);
        assertEquals(tmpI, userTest.getId_user());
    }

    @Test
    public void setSnp() throws Exception {
        tmpS = "Jerry Add Corney";
        userTest.setSnp(tmpS);
        assertEquals(tmpS, userTest.getSnp());
    }

    @Test
    public void getEnabled() throws Exception {
        userTest.setEnabled(tmpI);
        tmpI = userTest.getEnabled();
        assertEquals(1, tmpI);

    }

    @Test
    public void setEnabled() throws Exception {
        userTest.setEnabled(tmpI);
        assertEquals(tmpI, userTest.getEnabled());
    }

    @Test
    public void setContactsList() throws Exception {
        userTest.setContactsList(contactsList);
        assertEquals(contactsList, userTest.getContactsList());
    }

    @Test
    public void getId_user() throws Exception {
        userTest.setId_user(1);
        tmpI = userTest.getId_user();
        assertEquals(1, tmpI);
    }

    @Test
    public void getLogin() throws Exception {
        userTest.setLogin(tmpS);
        assertEquals(tmpS, userTest.getLogin());
    }

    @Test
    public void setLogin() throws Exception {
        userTest.setLogin(tmpS);
        assertEquals(tmpS, userTest.getLogin());
    }

    @Test
    public void getPassword() throws Exception {
        userTest.setPassword(tmpS);
        assertEquals(tmpS, userTest.getPassword());
    }

    @Test
    public void setPassword() throws Exception {
        userTest.setPassword(tmpS);
        assertEquals(tmpS, userTest.getPassword());
    }

    @Test
    public void getSnp() throws Exception {
        userTest.setSnp(tmpS);
        assertEquals(tmpS, userTest.getSnp());
    }

    @Test
    public void getContactsList() throws Exception {
        userTest.setContactsList(contactsList);
        assertEquals(contactsList, userTest.getContactsList());
    }

}