package com.example.lab6;

import com.example.lab6.model.Vocabulary;
import org.junit.jupiter.api.Test;

public class Lab6Test {
    @Test
    public void shouldTranslate(){
        Vocabulary V = new Vocabulary();
        String text = "Hello world";
        StringBuilder translateText = V.translateEnglishUkraine(text);
        translateText.equals("привет мир");
    }


}
