package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Cagy on 4/1/2018.
 */
@Entity
@Table(name = "contacts")
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_contact;
    private String surName;
    private String name;
    private String patronymic;
    private String mobileNumber;
    private String homeNumber;
    private String adds;
    private String email;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Contacts() {
    }

    public Contacts(@NotNull String surName, @NotNull String name, @NotNull String patronymic, @NotNull String mobileNumber) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.mobileNumber = mobileNumber;
    }

    public Contacts(@NotNull String surName, @NotNull String name, @NotNull String patronymic, @NotNull String mobileNumber, String homeNumber, String adds, String email, User user_id) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.mobileNumber = mobileNumber;
        this.homeNumber = homeNumber;
        this.adds = adds;
        this.email = email;
       // this.user_id = user_id;
    }

    public int getId_contact() {
        return id_contact;
    }

    public void setId_contact(int id_contact) {
        this.id_contact = id_contact;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contacts{");
        sb.append("id_contact=").append(id_contact);
        sb.append(", surName='").append(surName).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", patronymic='").append(patronymic).append('\'');
        sb.append(", mobileNumber='").append(mobileNumber).append('\'');
        sb.append(", homeNumber='").append(homeNumber).append('\'');
        sb.append(", adds='").append(adds).append('\'');
        sb.append(", email='").append(email).append('\'');
        //sb.append(", user_id=").append(user_id);
        sb.append('}');
        return sb.toString();
    }
}
