package com.maskordev.tasks;

public class SumInInterval {
    private int first;
    private int second;

    public SumInInterval(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int sum() {
        int res = 0;
        for (int i = first; i <= second; i++) {
            res += i;
        }
        return res;
    }
}
