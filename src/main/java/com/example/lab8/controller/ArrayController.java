package com.example.lab8.controller;

import com.example.lab8.model.ArrayGenerator;
import com.example.lab8.model.SumCounter;
import com.example.lab8.view.Constants;

import java.util.concurrent.ForkJoinPool;

public class ArrayController {
    public static void ArrayControllerGo(){
        ArrayGenerator generator = new ArrayGenerator();
        int[] array = generator.getArray();
        Long result = new ForkJoinPool().invoke(new SumCounter(array));
        System.out.println(Constants.RESULT + result);
    }
}
