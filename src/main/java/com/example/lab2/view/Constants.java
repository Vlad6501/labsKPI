package com.example.lab2.view;

public interface Constants {
    String WRONG_DATA = "wrong data, please try again";
    String DATA_REGEX = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";
    String PHONE_REGEX = "^\\+380\\d{3}\\d{2}\\d{2}\\d{2}$";
    String NAME_REGEX = "^[a-zA-Zа-яА-Я\\\\s]+";
    String NUMBER_REGEX = "^[0-9a-zа-я\\\\s]+";
    String ENTER_NAME = "please enter your name";
    String ENTER_SURNAME = "please enter your surname";
    String ENTER_PHONE = "please enter your phone number";
    String ENTER_ADRESS_HOUSE = "please enter your number of house";
    String ENTER_DATE_OF_BIRTHDAY = "please enter your birthday date";
    String ENTER_ADRESS_STREET = "please enter your street ";
    String ENTER_ADRESS_FLAT = "please enter your number of flat";
    String ENTER_CONTINUE_OR_NOT = "if you want to add new person enter <y>";

    static void displayInfo(String info) {
        System.out.println(info);
    }

}
