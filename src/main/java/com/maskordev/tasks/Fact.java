package com.maskordev.tasks;

public class Fact {
    public int recursion(Integer n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursion(n - 1);
        }
    }
}
