package com.example.lab8;

import com.example.lab8.model.SumCounter;
import com.example.lab8.view.Constants;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Lab_8Test {
    @Test
    public void compute() {
        int[] array = new int[Constants.ARRAY];
        Arrays.fill(array, 1);
        Long expected = 1000000L;
        Long actual = new ForkJoinPool().invoke(new SumCounter(array));
        Assert.assertEquals(expected, actual);
    }
}
