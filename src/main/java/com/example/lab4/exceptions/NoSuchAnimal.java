package com.example.lab4.exceptions;

public class NoSuchAnimal extends Exception {
    public NoSuchAnimal() {
        super("no such animal in this cage");
    }
}
