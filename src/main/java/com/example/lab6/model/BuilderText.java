package com.example.lab6.model;

import java.util.Map;

public class BuilderText {
    public static StringBuilder buildTextEnUk(String[] subText, Map<String,String> vocabulary){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < subText.length; i++){
            String normWord = subText[i].toLowerCase();
            if(vocabulary.get(normWord) != null){
                sb.append(vocabulary.get(normWord) + " ");
            }
            else {
                sb.append(subText[i] + " ");
            }
        }
        return sb;
    }
}
