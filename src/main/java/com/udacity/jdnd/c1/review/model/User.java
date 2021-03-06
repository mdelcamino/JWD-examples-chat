package com.udacity.jdnd.c1.review.model;

public class User {
    private Integer userid;
    private String username;
    private String password;
    private String salt;

    private String surname;
    private String lastname;

    public User(Integer userid,String username, String password, String salt,  String surname, String lastname) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.salt = salt;
       this.surname = surname;
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
