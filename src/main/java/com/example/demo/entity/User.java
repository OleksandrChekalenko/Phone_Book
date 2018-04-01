package com.example.demo.entity;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cagy on 4/1/2018.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private int id_user;
    @NotNull
    @UniqueElements
    private String login;
    @NotNull
    private String password;
    @NotNull
    private String snp;
    /*@OneToMany(targetEntity = Contacts.class, mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Contacts> contactsList = new ArrayList<>();
*/
    public User() {

    }

    public User(@NotNull @UniqueElements String login, @NotNull String password, @NotNull String snp) {
        this.login = login;
        this.password = password;
        this.snp = snp;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSnp() {
        return snp;
    }

    public void setSnp(String snp) {
        this.snp = snp;
    }

   /* public List<Contacts> getContactsList() {
        return contactsList;
    }

    public void setContactsList(List<Contacts> contactsList) {
        this.contactsList = contactsList;
    }*/

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id_user=").append(id_user);
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", snp='").append(snp).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
