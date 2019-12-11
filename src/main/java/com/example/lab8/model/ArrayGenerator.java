package com.example.lab8.model;

import com.example.lab8.view.Constants;

import java.util.Random;

public class ArrayGenerator {
    private int[] array;
    public ArrayGenerator() {
        int[] arr = new int[Constants.ARRAY];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        array = arr;
    }

    public int[] getArray() {
        return array;
    }
}


