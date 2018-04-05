package com.example.demo.controller;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.RoleService;
import com.example.demo.service.interfaces.UserService;
import com.example.demo.utils.Utils;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Oleksandr Chekalenko on 4/2/2018.
 */
@Controller
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/registration")
    public String showRegistrationPage() {
        return "registrationPage";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "loginPage";
    }


    @GetMapping("/error_page")
    public String errorPage() {
        return "errorPage";
    }

    @PostMapping("/newUser")
    public String createUser(@ModelAttribute User user, Model model) {

        List<String> errors = Utils.validateUser(user);
        for (User users : userService.getAll()) {
            if (users.getLogin().equals(user.getLogin()))
                errors.add("That login already in use. Please choose another login.");
        }
        if (!errors.isEmpty()) {
            model.addAttribute("errors", errors);
            return "registrationPage2";
        } else
            userService.save(user);
        return "susuccessRegistration";
    }

    @GetMapping("/about")
    public String about() {
        return "aboutPage";
    }
}
