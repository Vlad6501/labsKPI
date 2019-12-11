package com.example.lab7.controller;

import com.example.lab7.model.Text;
import com.example.lab7.view.Constants;

import java.util.ArrayList;
import java.util.List;

public class TextController {
    public static void TextControllerGo(){
        Text text = new Text();
        List<String> outputText = new ArrayList<>();
        outputText = text.ParseText(text.getInputText());

        System.out.println(Constants.RESULT);
        for (int i = 0; i < outputText.size(); i++){
            System.out.println(outputText.get(i));
        }
    }
}
