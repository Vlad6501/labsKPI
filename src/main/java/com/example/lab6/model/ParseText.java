package com.example.lab6.model;

public class ParseText {
    public static String[] parsingText(String text){
        String[] subText;
        String delimeter = " ";
        subText = text.split(delimeter);
        return subText;
    }
}
