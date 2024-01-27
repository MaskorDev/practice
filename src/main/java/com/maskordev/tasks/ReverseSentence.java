package com.maskordev.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseSentence {
    private String sentence;
    private String[] words;

    public ReverseSentence(String sentence) {
        this.sentence = sentence;
    }

    public void fillArr() {
        words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
    }

    public void printReverseArr() {
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
