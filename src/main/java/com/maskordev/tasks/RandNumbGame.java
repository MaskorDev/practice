package com.maskordev.tasks;
import java.util.Random;
import java.util.Scanner;

public class RandNumbGame {
    Random random = new Random();
    int r = random.nextInt(1, 3);
    private Integer number;

    public RandNumbGame(Integer number) {
        this.number = number;
    }

    public void game() {
        System.out.println("Загадай число от 1 до 3");
        System.out.println(r);
        if (number == r) {
            System.out.println("Вы угадали !");
        } else {
            System.out.println("Вы не угадали !");
        }
    }
}
