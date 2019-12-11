package com.example.lab1.controllers;

import com.example.lab1.view.Constants;

import java.util.Scanner;

public class Controller {


    public int[][] rotateMatrix(int[][] m) {
        if (m.length == 0) return new int[0][0];

        int cols = m[0].length;
        int rows = m.length;

        int[][] result = new int[m[0].length][m.length];

        for (int row = 0; row < cols; row++) {
            for (int col = 0; col < rows; col++) {
                result[row][col] = m[col][rows - row - 1];
            }
        }
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + Constants.TABULATION);
            }
            System.out.println();
        }

        return result;
    }

    public void perfectNumberFinding(int limitForLookingFor) {
        int summ = 1;
        for (int numm = 0; numm <= limitForLookingFor; numm++) {
            for (int i = 2; i < numm; i++) {
                if (numm % i == 0) {
                    summ += i;
                }
            }
            if (numm == summ) {

                System.out.println(Constants.PERFECT_NUMBER + numm);
            }
            summ = 1;
        }
    }

    public void numberTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.println(Constants.ENTER_NUMBER);
        int high = in.nextInt();

        for (int i = 1; i <= high; i++) {

            for (int j = 1; j <= high - i; j++)
                System.out.print(Constants.TRIPLE_SPACE);

            for (int k = 1; k < i; k++)
                System.out.print((k >= 10) ? +k : Constants.DOUBLE_SPACE + k);

            for (int k = i; k >= 1; k--)
                System.out.print((k >= 10) ? +k : Constants.DOUBLE_SPACE + k);
            System.out.println();
        }
    }
}
