package com.kodilla.good.patterns.challenges;

public class User {

    public String firstName;
    public String surname;
    public int phoneNumber;

    public User(String firstName, String surname, int phoneNumber) {
        this.firstName = firstName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
