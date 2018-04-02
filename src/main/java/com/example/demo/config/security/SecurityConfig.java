
package com.example.demo.config.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.example.demo.config")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private DataSource dataSource;

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .usersByUsernameQuery("SELECT name, password, enabled FROM users WHERE name = ?")
                .authoritiesByUsernameQuery("SELECT name, role FROM roles WHERE name = ?")
                .dataSource(dataSource);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/user/users","/wallet/wallets").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/wallet/wallets", "/payments/**").access("hasRole('ROLE_USER')")
                .and().formLogin()
                .loginPage("/loginPage").permitAll()//.failureUrl("/error_page")
                .usernameParameter("name")
                .passwordParameter("password")
                .and().exceptionHandling().accessDeniedPage("/error_page");


    }


}
