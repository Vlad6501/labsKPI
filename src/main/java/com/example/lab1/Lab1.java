package com.example.lab1;

import com.example.lab1.controllers.Controller;
import com.example.lab1.view.Constants;

public class Lab1 {
    private static int[][] arrayForRotate = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.numberTriangle();
        controller.rotateMatrix(arrayForRotate);
        controller.perfectNumberFinding(Constants.LIMIT_FOR_FINDING_PERFECT_NUMBER);
    }
}