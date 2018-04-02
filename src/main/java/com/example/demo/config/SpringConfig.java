package com.example.demo.config;



import com.example.demo.dao.RoleDaoImpl;
import com.example.demo.dao.UserDaoImpl;
import com.example.demo.dao.interfaces.RoleDao;
import com.example.demo.dao.interfaces.UserDao;
import com.example.demo.service.RoleService;
import com.example.demo.service.RoleServiceImpl;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
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
    public RoleService getRoleService() {
        return new RoleServiceImpl();}

    @Bean
    public RoleDao getRoleDao() { return new RoleDaoImpl();}
}
