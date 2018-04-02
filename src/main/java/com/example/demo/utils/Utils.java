package com.example.demo.utils;

import com.example.demo.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cagy on 12/6/2017.
 */
public class Utils {
    public static List<String> validate(User user) {
        List<String> result = new ArrayList<>();
        if (user.getLogin().length() < 3) {
            result.add("Login too short");
        }
        return result;
    }
}
