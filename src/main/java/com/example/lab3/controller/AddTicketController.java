package com.example.lab3.controller;

import com.example.lab3.view.Constants;

import java.util.Scanner;

public class AddTicketController {
    public static String checkAddTicket(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf(Constants.WHICH_TICKET);
        String checkWhichTicket = null;
        boolean error = true;
        do{
            String checkTicket = scanner.next();
            if (checkTicket.equals(Constants.NORMAL)) {
                return Constants.NORMAL;
            }
            if (checkTicket.equals(Constants.SCHOOL)) {
                return Constants.SCHOOL;
            }
            if (checkTicket.equals(Constants.STUDENT)) {
                return Constants.STUDENT;
            }
            else {
                System.out.println(Constants.INCORRECT);
            }
        }while (error);
        return checkWhichTicket;
    }
}
