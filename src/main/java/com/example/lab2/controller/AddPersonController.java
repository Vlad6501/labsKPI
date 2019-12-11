package com.example.lab2.controller;

import com.example.lab2.model.Person;
import com.example.lab2.view.Constants;

import java.util.Scanner;

public class AddPersonController {

    public Person addPerson() {
        Person person = new Person();
        person.setName(addData(Constants.NAME_REGEX, Constants.ENTER_NAME));
        person.setSurname(addData(Constants.NAME_REGEX, Constants.ENTER_SURNAME));
        person.setPhoneNumber(addData(Constants.PHONE_REGEX, Constants.ENTER_PHONE));
        person.setDateOfBirth(addData(Constants.DATA_REGEX, Constants.ENTER_DATE_OF_BIRTHDAY));
        person.getAddress().setStreet(addData(Constants.NAME_REGEX, Constants.ENTER_ADRESS_STREET));
        person.getAddress().setNumberOfHouse(addData(Constants.NUMBER_REGEX, Constants.ENTER_ADRESS_HOUSE));
        person.getAddress().setNumberOfFlat(addData(Constants.NUMBER_REGEX, Constants.ENTER_ADRESS_FLAT));
        Constants.displayInfo(person.toString());
        return person;
    }

    private String addData(String regexForData, String userInformation) {
        Constants.displayInfo(userInformation);
        Scanner scanner = new Scanner(System.in);
        String input = null;
        do {
            if (input != null) {
                System.out.println(Constants.WRONG_DATA);
            }
            input = scanner.next();
        } while (dontMatchesRegex(regexForData, input));


        return input;
    }

    private boolean dontMatchesRegex(String regex, String actualData) {
        return !actualData.matches(regex);
    }
}
