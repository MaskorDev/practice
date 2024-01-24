package com.maskordev.tasks;

public class Palindrom {
    private String str;

    public Palindrom(String str) {
        this.str = str;
    }

    public boolean isPalindrom() {
        StringBuilder stringBuilder = new StringBuilder(str);
        if (str.equals(String.valueOf(stringBuilder.reverse()))) {
            return true;
        }
        else {
            return false;
        }
    }
}
