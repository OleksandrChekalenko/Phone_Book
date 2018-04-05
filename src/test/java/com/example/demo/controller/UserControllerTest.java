package com.example.demo.controller;

        import com.example.demo.Application;
        import com.example.demo.service.interfaces.RoleService;
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
        import org.springframework.test.web.servlet.setup.MockMvcBuilders;
        import org.springframework.web.context.WebApplicationContext;

        import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
        import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserControllerTest {

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
    public void index() throws Exception {

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    public void loginPage() throws Exception {
        mockMvc.perform(get("/loginPage"))
                .andExpect(status().isOk())
                .andExpect(view().name("loginPage"));
    }

    @Test
    public void showRegistrationPage() throws Exception {
        mockMvc.perform(get("/registration"))
                .andExpect(status().isOk())
                .andExpect(view().name("registrationPage"));
    }

    @Test
    public void errorPage() throws Exception {
        mockMvc.perform(get("/error_page"))
                .andExpect(status().isOk())
                .andExpect(view().name("errorPage"));
    }

    @Test
    public void createUser() throws Exception {

    mockMvc.perform(post("/newUser").param("login", "mockito")
                    .param("password", "111111")
                    .param( "snp","mockito mockito mockito"))
                    .andExpect(redirectedUrl(null)).andExpect(status().isOk());

    }

    @Test
    public void about() throws Exception {
        mockMvc.perform(get("/about")).andExpect(status().isOk())
                .andExpect(view().name("aboutPage"));
    }

}
