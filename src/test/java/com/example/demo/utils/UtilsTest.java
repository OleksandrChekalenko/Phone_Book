package com.example.demo.utils;

import com.example.demo.entity.Contacts;
import com.example.demo.entity.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Cagy on 4/5/2018.
 */
public class UtilsTest {

    private User user;
    private Contacts contact;

    @Test
    public void validateUser() throws Exception {
        user = new User("validateUser", "111111", "validateUser validateUser validateUser");
        List<String> validateUser = Utils.validateUser(user);
        assertEquals(0, validateUser.size());
    }

    @Test
    public void validateContact() throws Exception {
        contact = new Contacts("validateContact", "validateContact",
                "validateContact", "+380000000000", "validateContact@gmail.com");
        List<String> validateContact = Utils.validateContact(contact);
        assertEquals(0, validateContact.size() );
    }

}