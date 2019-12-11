package com.example.lab4.exceptions;

public class NoSpaceForAnimalException extends Exception {
    public NoSpaceForAnimalException() {
        super("No else place in cage");
    }
}
