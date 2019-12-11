package com.example.lab7;


import com.example.lab7.model.LatinEqI;
import com.example.lab7.model.Text;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Lab_7Test {
    @Test
    public void shouldVowAndCons() {
        String inputLine = "uhbasd fghdbммп uhojag opiujk";
        List<String> expected = new ArrayList<>();
        LatinEqI actualI = inputLine1 -> {
            return Text.ParseText(inputLine);
        };
        expected.add("uhojag");
        expected.add("opiujk");
        Assert.assertEquals(expected, actualI.findCorrectWords(inputLine));
    }
}
