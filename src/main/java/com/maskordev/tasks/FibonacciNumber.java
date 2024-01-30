package com.maskordev.tasks;

public class FibonacciNumber {

    public static int calcFibonacci(int N) {
        if (N == 1)
            return 1;
        else if (N == 0)
            return 0;
        else {
            return calcFibonacci(N-1) + calcFibonacci(N-2);
        }
    }
}
