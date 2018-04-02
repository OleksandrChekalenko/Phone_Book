package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Cagy on 4/2/2018.
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
