package com.example.demo.controller;

import com.example.demo.entity.Contacts;
import com.example.demo.entity.User;
import com.example.demo.service.ContactsService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Created by Cagy on 4/2/2018.
 */
@Controller
@RequestMapping("/contact")
public class ContactsController {

    @Autowired
    private UserService userService;
    @Autowired
    private ContactsService contactsService;

    @GetMapping("/contacts")
    public String getAllContacts(Model model, Principal principal) {
        User user = userService.getUserByLogin(principal.getName());
        model.addAttribute("contacts", contactsService.getAll(user.getId_user()));
        return "contactsList";
    }




}
