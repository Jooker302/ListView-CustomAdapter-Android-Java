package com.example.assignment3;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nPhone: " + phoneNumber;
    }
}

