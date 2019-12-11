package com.example.lab8.model;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;


public class SumCounter extends RecursiveTask<Long> {
    private int[] array;

    public SumCounter(int[] arr) {
        array = arr;
    }


    @Override
    protected Long compute() {
        long sum = 0;
        if (array.length > 20) {
            int length = array.length / 2;
            int[] firstHalf = new int[length];
            int[] secondHalf = new int[array.length - length];
            System.arraycopy(array, 0, firstHalf, 0, firstHalf.length);
            System.arraycopy(array, length, secondHalf, 0, secondHalf.length);
            SumCounter subTask1 = new SumCounter(firstHalf);
            SumCounter subTask2 = new SumCounter(secondHalf);
            subTask1.fork();
            subTask2.fork();
            sum = subTask1.join() + subTask2.join();
        } else {
            for (int number: array) {
                sum += number;
            }
        }
        return sum;
    }
}
