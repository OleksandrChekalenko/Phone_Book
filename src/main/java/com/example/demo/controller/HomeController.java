package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by Cagy on 4/2/2018.
 */
@Controller
public class HomeController {

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

    
}
