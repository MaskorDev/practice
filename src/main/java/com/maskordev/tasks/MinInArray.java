package com.maskordev.tasks;

import java.util.Arrays;
import java.util.Random;

public class MinInArray {
    private static int[] array = new int[10];
    static Random random = new Random();

    public static void fillArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void minInArray() {
        System.out.println(Arrays.stream(array).min().orElseThrow());
    }
}
