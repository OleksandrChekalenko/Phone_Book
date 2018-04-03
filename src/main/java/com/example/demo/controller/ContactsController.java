package com.example.demo.controller;

import com.example.demo.entity.Contacts;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.ContactsService;
import com.example.demo.service.interfaces.UserService;
import com.example.demo.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

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
        if (principal == null) return "/loginPage";
        User user = userService.getUserByLogin(principal.getName());
        model.addAttribute("contacts", contactsService.getAll(user.getId_user()));
        return "contactsList";
    }

    @GetMapping("/contacts/addContact")
    public String createContact() {
        return "addContact";
    }

    @PostMapping("/newContact")
    public String addNewContact(@ModelAttribute Contacts contact, Principal principal, Model model) {
        User user = userService.getUserByLogin(principal.getName());
        List<String> errors = Utils.validateContact(contact);
        if (!errors.isEmpty()) {
            model.addAttribute("errors", errors);
            return "createContactForm2";
        } else {
            user.getContactsList().add(contact);
            contact.setUser(user);
            userService.update(user);
            return "redirect:/contact/contacts";
        }
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

    @GetMapping("edit/{id_contact}")
    public String editPage(@PathVariable("id_contact") int id, Model model) {
        model.addAttribute("contacts", contactsService.getById(id));
        return "editContact";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Contacts contact, Principal principal) {
        contact.setUser(userService.getUserByLogin(principal.getName()));
        contactsService.update(contact);
        return "redirect:/contact/contacts";
    }

    @GetMapping("contacts/sortContactsByName")
    public String sortContactsByName(Model model, Principal principal) {
        model.addAttribute("contacts", contactsService.sortContactsByName(contactsService.getAll(userService.getUserByLogin(principal.getName()).getId_user())));
        return "redirect:/contact/contacts";
    }
    @GetMapping("contacts/sortContactsBySurName")
    public String sortContactsBySurName(Model model, Principal principal) {
        model.addAttribute("contacts", contactsService.sortContactsBySurName(contactsService.getAll(userService.getUserByLogin(principal.getName()).getId_user())));
        return "redirect:/contact/contacts";
    }
    @GetMapping("contacts/sortContactsByNumber")
    public String sortContactsByNumber(Model model, Principal principal) {
        model.addAttribute("contacts", contactsService.sortContactsByNumber(contactsService.getAll(userService.getUserByLogin(principal.getName()).getId_user())));
        return "redirect:/contact/contacts";
    }
}

