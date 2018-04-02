package com.example.demo.config;



import com.example.demo.dao.ContactsDaoImpl;
import com.example.demo.dao.RoleDaoImpl;
import com.example.demo.dao.UserDaoImpl;
import com.example.demo.dao.interfaces.ContactsDao;
import com.example.demo.dao.interfaces.RoleDao;
import com.example.demo.dao.interfaces.UserDao;
import com.example.demo.service.*;
import com.example.demo.service.interfaces.ContactsService;
import com.example.demo.service.interfaces.RoleService;
import com.example.demo.service.interfaces.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public UserService getUserService() {
        return new UserServiceImpl();
    }

    @Bean
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }

    @Bean
    public ContactsService getContactsService() {
        return new ContactsServiceImpl();
    }

    @Bean
    public ContactsDao getContactsDao() {
        return new ContactsDaoImpl();
    }


    @Bean
    public RoleService getRoleService() {
        return new RoleServiceImpl();}

    @Bean
    public RoleDao getRoleDao() { return new RoleDaoImpl();}
}
