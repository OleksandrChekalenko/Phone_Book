package com.example.demo.entity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Oleksandr Chekalenko on 4/4/2018.
 */
public class ContactsTest {

    private Contacts contact = new Contacts();
    private String tmpS = "Kevin";
    private int tmpI = 1;
    private User user = new User();

    @Test
    public void getId_contact() throws Exception {
        setId_contact();
        tmpI = contact.getId_contact();
        assertEquals(tmpI, contact.getId_contact());
    }

    @Test
    public void setId_contact() throws Exception {
        contact.setId_contact(tmpI);
        assertEquals(tmpI, contact.getId_contact());
    }

    @Test
    public void getSurName() throws Exception {
        setSurName();
        assertEquals(tmpS, contact.getSurName());
    }

    @Test
    public void setSurName() throws Exception {
        contact.setSurName(tmpS);
        assertEquals(tmpS, contact.getSurName());

    }

    @Test
    public void getName() throws Exception {
        setName();
        assertEquals(tmpS, contact.getName());
    }

    @Test
    public void setName() throws Exception {
        contact.setName(tmpS);
        assertEquals(tmpS, contact.getName());
    }

    @Test
    public void getPatronymic() throws Exception {
        setPatronymic();
        assertEquals(tmpS, contact.getPatronymic());
    }

    @Test
    public void setPatronymic() throws Exception {
        contact.setPatronymic(tmpS);
        assertEquals(tmpS, contact.getPatronymic());
    }

    @Test
    public void getMobileNumber() throws Exception {
        setMobileNumber();
        assertEquals(tmpS, contact.getMobileNumber());
    }

    @Test
    public void setMobileNumber() throws Exception {
        contact.setMobileNumber(tmpS);
        assertEquals(tmpS, contact.getMobileNumber());
    }

    @Test
    public void getHomeNumber() throws Exception {
        setHomeNumber();
        assertEquals(tmpS, contact.getHomeNumber());
    }

    @Test
    public void setHomeNumber() throws Exception {
        contact.setHomeNumber(tmpS);
        assertEquals(tmpS, contact.getHomeNumber());
    }

    @Test
    public void getAdds() throws Exception {
        setAdds();
        assertEquals(tmpS, contact.getAdds());
    }

    @Test
    public void setAdds() throws Exception {
        contact.setAdds(tmpS);
        assertEquals(tmpS, contact.getAdds());
    }

    @Test
    public void getEmail() throws Exception {
        setEmail();
        assertEquals(tmpS, contact.getEmail());
    }

    @Test
    public void setEmail() throws Exception {
        contact.setEmail(tmpS);
        assertEquals(tmpS, contact.getEmail());
    }

    @Test
    public void getUser() throws Exception {
        setUser();
        assertEquals(user, contact.getUser());
    }

    @Test
    public void setUser() throws Exception {
        contact.setUser(user);
        assertEquals(user, contact.getUser());
    }

}