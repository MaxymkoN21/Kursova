package com.example.app.Database;

public class User {
    private String FirstName;
    private String lastname;
    private String username;
    private String password;
    private String location;
    private String age;
    private String gender;

    public User(String firstName, String lastname, String username, String password, String location, String age, String gender) {
        FirstName = firstName;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.location = location;
        this.age = age;
        this.gender = gender;
    }

    public User() {

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
