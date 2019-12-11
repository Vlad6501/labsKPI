package com.example.lab6.controller;

import com.example.lab6.view.Constants;

import java.util.Scanner;

public class InputCheck {
    public static String checkLetter(String str) {
        Scanner scanner = new Scanner(System.in);
        for(;;){
            System.out.printf(str);
            String checkLetter = scanner.next();
            if (checkLetter.matches(Constants.CHECKLETTER)) {
                String letterNorm = checkLetter.toLowerCase();
                return letterNorm;
            }
            else {
                System.out.printf(Constants.INCORRECT);
            }
        }
    }
}
