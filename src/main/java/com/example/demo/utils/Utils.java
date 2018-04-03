package com.example.demo.utils;

import com.example.demo.entity.Contacts;
import com.example.demo.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Cagy on 12/6/2017.
 */
public class Utils {
    public static List<String> validateUser(User user) {
        List<String> errors = new ArrayList<>();
        if (user.getLogin().replaceAll("[^\\w\\s]","").length() <= 3) errors.add("Your login less than 3 characters. ");
        if (user.getPassword().length() <= 5) errors.add("Ypu password too short. ");
        if (user.getSnp().length() <= 5) errors.add("You full name too short.");
        return errors;
    }

    public static List<String> validateContact(Contacts contact) {
        List<String> errors = new ArrayList<>();
        String number = contact.getMobileNumber();
        String email = contact.getEmail();
        Pattern patternNumber = Pattern.compile("^((\\+?380)([0-9]{9}))$");
        Pattern patternEmail = Pattern.compile("^((\\w|[-+])+(\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$");
        Matcher matcherNumber = patternNumber.matcher(number);
        Matcher matcherEmail = patternEmail.matcher(email);
        if (contact.getSurName().length() < 4) errors.add("    Surname shorter than 4 characters.   ");
        if (contact.getName().length() < 4) errors.add("Name shorter than 4 characters.   ");
        if (contact.getPatronymic().length() < 4) errors.add("Patronymic shorter than 4 characters.   ");
        if (!matcherNumber.matches()) errors.add("Wrong mobile number.   ");
        if (!matcherEmail.matches()) errors.add("Wrong email.   ");

        return errors;

    }
}
