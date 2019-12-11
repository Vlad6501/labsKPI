package com.example.lab3.controller;

import com.example.lab3.view.Constants;

import java.util.Scanner;

public  class QuestionYesNoController {
    public static boolean questionYesNo(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(str);
        boolean checkYesNo;
        do{
            String checkQuestion = scanner.next();
            if (checkQuestion.equals(Constants.YES)) {
                checkYesNo = true;
                break;
            }
            if (checkQuestion.equals(Constants.NO)) {
                checkYesNo = false;
                break;
            }
            else {
                System.out.println(Constants.INCORRECT);
            }
        }while (true);
        return checkYesNo;
    }
}