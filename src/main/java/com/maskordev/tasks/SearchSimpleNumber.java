package com.maskordev.tasks;

import java.util.ArrayList;

public class SearchSimpleNumber {
    private int a;
    private int b;

    private ArrayList<Integer> arr;

    public SearchSimpleNumber(int a, int b) {
        this.a = a;
        this.b = b;
        this.arr = new ArrayList<>();
    }

    public ArrayList<Integer> searchSimpleNumber() {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                arr.add(i);
            }
        }
        return arr;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}