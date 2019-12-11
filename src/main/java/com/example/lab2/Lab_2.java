package com.example.lab2;

import com.example.lab2.controller.AddPersonController;
import com.example.lab2.model.Person;
import com.example.lab2.view.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_2 {
    private static List<Person> group = new ArrayList<Person>();

    public static void main(String[] args) {
        boolean continueProgramm = true;
        for (; continueProgramm; ) {
            continueProgramm = programmRun();
        }
        Constants.displayInfo("your group is\n" + group);
    }

    public static boolean programmRun() {
        AddPersonController addPersonController = new AddPersonController();
        group.add(addPersonController.addPerson());
        return continueProgramm();

    }

    private static boolean continueProgramm() {
        Scanner scanner = new Scanner(System.in);
        Constants.displayInfo(Constants.ENTER_CONTINUE_OR_NOT);
        String userAnswer = scanner.next();
        return userAnswer.equals("y");

    }
}