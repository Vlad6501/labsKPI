package com.example.lab2.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Address {
    String street;
    String numberOfHouse;
    String numberOfFlat;

    public Address() {
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumberOfHouse(String numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public void setNumberOfFlat(String numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }
}