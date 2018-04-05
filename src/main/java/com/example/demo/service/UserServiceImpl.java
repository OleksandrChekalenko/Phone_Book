package com.example.demo.service;

import au.com.bytecode.opencsv.CSVWriter;
import com.example.demo.dao.interfaces.UserDao;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.service.interfaces.RoleService;
import com.example.demo.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Oleksandr Chekalenko on 4/2/2018.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserDao userDao;

    public static final String ROLE_USER = "ROLE_USER";

    @Value("${spring.jpa.CSV}")
    private boolean csvBool;

    @Value("${spring.jpa.driver}")
    private String driver;

    @Override
    public void save(User user) {

        if (driver.equals("com.mysql.jdbc.Driver")){

            if (csvBool){
                try {
                    CSVWriter writer = new CSVWriter(new FileWriter("CSV_Users.csv", true));
                    writer.writeNext(user.toString().split(","));
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            userDao.save(user);
            Role role = new Role();
            role.setName(user.getLogin());
            role.setRole(ROLE_USER);
            roleService.save(role);
            try {
                CSVWriter writer = new CSVWriter(new FileWriter("CSV_Role.csv", true));
                writer.writeNext(role.toString().split(","));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public void update(User user) {

        userDao.update(user);
        if (driver.equals("com.mysql.jdbc.Driver")) {

            if (csvBool) {
                try {
                    CSVWriter writer = new CSVWriter(new FileWriter("CSV_Contacts.csv", true));
                    writer.writeNext(user.getContactsList().get(user.getContactsList().size() - 1)
                            .toString().replaceAll("\\[" , "")
                            .replaceAll("\\]" , "").split(","));
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User getUserByLogin(String login) {
        return userDao.getUserByLogin(login);
    }

    @Override
    public List<User> sortContactsByName(List<User> list) {
        return null;
    }

    @Override
    public List<User> sortContactsBySurName(List<User> list) {
        return null;
    }

    @Override
    public List<User> sortContactsByNumber(List<User> list) {
        return null;
    }

    @Override
    public void delete(int id) {
        userDao.deleteById(id);
    }
    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public void deleteContact(int id) {
    }

}
