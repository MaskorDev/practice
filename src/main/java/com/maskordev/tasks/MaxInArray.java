package com.maskordev.tasks;

import java.util.Arrays;
import java.util.Random;

public class MaxInArray {
    private int[] array = new int[10];

    public MaxInArray() {

    }

    public String fillArray() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
           array[i] = random.nextInt(-100, 100);
        }
        return Arrays.toString(array);
    }

    public Integer maxInArray() {
        return Arrays.stream(array).max().orElseThrow();
    }
}
