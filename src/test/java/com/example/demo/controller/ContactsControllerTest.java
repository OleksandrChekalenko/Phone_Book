package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.config.SpringConfig;
import com.example.demo.entity.Contacts;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.UserService;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.junit.Assert.*;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DemoApplication.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContactsControllerTest {

    private MockMvc mockMvc;

    @Autowired
    WebApplicationContext wac;

    @Autowired
    private UserService userService;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }


    @Test
    public void getAllContacts() throws Exception {

        /*User user = new User("testttest", "111111", "asdsdfasd");
        List<Contacts> contacts =new ArrayList<>();
        contacts.add(new Contacts("David", "Den", "D",
                            "+380734160880"));
        user.setContactsList(contacts);
        userService.save(user);
        Role role = new Role();
        role.setName(user.getLogin());
        role.setRole("ROLE_USER");
        Principal principal = () -> "TEST_PRINCIPAL";
        MvcResult result = mockMvc.perform(get("/loginPage")
                .param("name",user.getLogin())
                .param("password", user.getPassword()))
                .andReturn();


        mockMvc.perform(get("/contact/contacts").param("name",user.getLogin())
                .param("password", user.getPassword()))
                .andExpect(status().isOk())
                .andExpect(view().name("contactList"));*/

       // mockMvc.perform(MockMvcRequestBuilders.get())
    }

    @Test
    public void createContact() throws Exception {
    }

    @Test
    public void addNewContact() throws Exception {
    }

    @Test
    public void deleteContact() throws Exception {
    }

    @Test
    public void editPage() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void sortContactsByName() throws Exception {
    }

    @Test
    public void sortContactsBySurName() throws Exception {
    }

    @Test
    public void sortContactsByNumber() throws Exception {
    }

}
