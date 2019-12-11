package com.example.lab6.controller;

import com.example.lab6.model.Vocabulary;
import com.example.lab6.view.Constants;

import java.util.Scanner;

import static com.example.lab6.controller.SelectOperation.operation;

public class VocabularyController {
    public static void startWork(){
        Vocabulary V = new Vocabulary();
        for(;;){
            int checkNumber = operation();
            if(checkNumber == 3){
                return;
            }
            if(checkNumber == 1){
                V.addWords();
                System.out.printf(Constants.ADDED);
            }
            if(checkNumber == 2){
                Scanner scanner = new Scanner(System.in);
                System.out.printf(Constants.TEXT);
                String text = scanner.nextLine();
                StringBuilder translateText =V.translateEnglishUkraine(text);
                System.out.println(translateText);
            }
        }
    }
}
