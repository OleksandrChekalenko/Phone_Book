package com.example.demo.controller;

import com.example.demo.entity.Contacts;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.ContactsService;
import com.example.demo.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * Created by Cagy on 4/2/2018.
 */
@Controller
@RequestMapping("/contact")
public class ContactsController {

    int deletedContactId;

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

    @GetMapping("/contacts/addContact")
    public String createContact() {
        return "addContact";
    }

    @PostMapping("/newContact")
    public String addNewContact(@ModelAttribute Contacts contact, Principal principal) {
        User user = userService.getUserByLogin(principal.getName());
        user.getContactsList().add(contact);
        contact.setUser(user);
        userService.update(user);
        return "redirect:/contact/contacts";
    }

    @GetMapping("contacts/delete/{id_contact}")
    public String deleteContact(@PathVariable("id_contact") int id_contact, Principal principal) {
        User user = userService.getUserByLogin(principal.getName());
        Contacts contact = contactsService.getById(id_contact);
        deletedContactId = contact.getId_contact();
        contact.setUser(null);
        contactsService.update(contact);
        contactsService.deleteContact(deletedContactId);
        return "redirect:/contact/contacts";
    }

}

