package com.example.lab2.model;

import lombok.*;


@ToString
@Data
public class Person {
    private Address address;
    private String name;
    private String surname;
    private String phoneNumber;
    private String dateOfBirth;

    public Person(){
        Address address = new Address();
        this.address = address;

    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}