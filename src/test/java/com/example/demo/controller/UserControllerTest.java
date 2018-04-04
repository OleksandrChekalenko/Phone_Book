package com.example.demo.controller;

import com.example.demo.config.JpaConfig;
import com.example.demo.config.SpringConfig;
import com.example.demo.config.WebAppConfig;
import com.example.demo.config.WebAppInitializer;
import com.example.demo.config.security.SecurityConfig;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by Cagy on 4/4/2018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaConfig.class, WebAppConfig.class, SpringConfig.class, WebAppInitializer.class, SecurityConfig.class})
@WebAppConfiguration
public class UserControllerTest {

    @Autowired
    private WebApplicationContext context;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Autowired
    private UserService userService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void index() throws Exception {

    }

    @Test
    public void loginPage() throws Exception {
    }

    @Test
    public void login() throws Exception {
    }

    @Test
    public void errorPage() throws Exception {
    }

    @Test
    public void createUser() throws Exception {
        /*User user = new User("testLogin", "111111", "test test test");
        userService.save(user);*/


    }

    @Test
    public void about() throws Exception {
    }

}