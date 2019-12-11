package com.example.lab1.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ControllerTest {

    @Test
    public void shouldReturnRotateMatrixWhenRotateFunctionCalled() {
        Controller controller = new Controller();
        int[][] matrixToRotate = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] expected = {{4, 8, 12, 16}, {3, 7, 11, 15}, {2, 6, 10, 14}, {1, 5, 9, 13}};
        int[][] actual = controller.rotateMatrix(matrixToRotate);
        assertArrayEquals(expected, actual);
    }
}
