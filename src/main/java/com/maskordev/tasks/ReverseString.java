package com.maskordev.tasks;

public class ReverseString {
    private String str;
    public ReverseString(String str) {
        this.str = str;
    }

    public StringBuilder reverseString() {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse();
    }
}
