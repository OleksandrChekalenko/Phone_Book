package com.example.demo.controller;

import com.example.demo.Application;
import com.example.demo.entity.Contacts;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.service.UserServiceImpl;
import com.example.demo.service.interfaces.RoleService;
import com.example.demo.service.interfaces.UserService;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContactsControllerTest {

    private User newUser() {
        User user = new User("getAllContacts", "111111", "asdsdfasd");
        List<Contacts> contacts =new ArrayList<>();
        contacts.add(new Contacts("David", "Den", "D",
                "+380734160880"));
        user.setContactsList(contacts);
        userService.save(user);
        Role role = new Role(user.getLogin(), UserServiceImpl.ROLE_USER);
                roleService.save(role);
        return user;
    }

    private MockMvc mockMvc;

    @Autowired
    WebApplicationContext wac;

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }


    @Test
    @WithMockUser(username = "getAllContacts", password = "111111", authorities = "ROLE_USER")
    public void getAllContacts() throws Exception {
        User user = newUser();
        mockMvc.perform(get("/loginPage")
                .param("login", user.getLogin())
                .param("password", user.getPassword()))
                .andExpect(redirectedUrl(null))
                .andExpect(status().isOk());

        mockMvc.perform(get("/contact/contacts")).andExpect(status().isOk());
    }

    @Test
    @WithMockUser(username = "getAllContacts", password = "111111", authorities = "ROLE_USER")
    public void createContact() throws Exception {
    mockMvc.perform(get("/contact/contacts/addContact"))
                .andExpect(status().isOk())
                .andExpect(view().name("addContact"));

    }


}
