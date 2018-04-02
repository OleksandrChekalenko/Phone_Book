package com.example.demo.controller;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.RoleService;
import com.example.demo.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Cagy on 4/2/2018.
 */
@Controller
public class HomeController {

    @Autowired
    private RoleService roleService;
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "loginPage";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user) {
        return "index";
    }

    @GetMapping("/error_page")
    public String errorPage() {
        return "errorPage";
    }

    @PostMapping("/newUser")
    public String createUser(@ModelAttribute User user, Model model) {
            userService.save(user);
            Role role = new Role();
            role.setName(user.getLogin());
            role.setRole("ROLE_USER");
            roleService.save(role);
            return "susuccessRegistration";
    }

    @GetMapping("/about")
    public String about() {
        return "aboutPage";
    }
}
