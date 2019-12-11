package com.example.lab6.model;

import com.example.lab6.view.Constants;

import java.util.HashMap;
import java.util.Map;

import static com.example.lab6.model.BuilderText.buildTextEnUk;
import static com.example.lab6.controller.InputCheck.checkLetter;
import static com.example.lab6.model.ParseText.parsingText;

public class Vocabulary {
    Map<String,String> vocabulary = new HashMap<>();

    public Vocabulary() {
        vocabulary.put("hello", "привет");
        vocabulary.put("world","мир");
    }

    public void addWords(){
        vocabulary.put(checkLetter(Constants.ENGLISH), checkLetter(Constants.UKRAINE));
    }

    public Map<String, String> getVocabulary() {
        return vocabulary;
    }

    public StringBuilder translateEnglishUkraine(String text){
        return buildTextEnUk(parsingText(text), getVocabulary());
    }
}
