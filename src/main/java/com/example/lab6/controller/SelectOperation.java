package com.example.lab6.controller;

import com.example.lab6.view.Constants;

import java.util.Scanner;

public class SelectOperation {
    public static int operation() {
        Scanner scanner = new Scanner(System.in);
        for(;;){
            System.out.printf(Constants.OPERATION);
            String checkOperation = scanner.next();
            if (checkOperation.equals("1")) {
                return 1;
            }
            if (checkOperation.equals("2")) {
                return 2;
            }
            if (checkOperation.equals("3")) {
                return 3;
            }
            else {
                System.out.println(Constants.INCORRECTNUMBER);
            }
        }
    }
}
