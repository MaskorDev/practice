package com.maskordev.startapp;

import com.maskordev.tasks.*;

public class Main {
    public static void main(String[] args) {
        //task #1
        AreaRectangle areaRectangle = new AreaRectangle();
        areaRectangle.setA(5);
        areaRectangle.setB(6);
        System.out.println(areaRectangle.calcArea() + "\n");

        //task #2
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        EvenOrOdd evenOrOdd1 = new EvenOrOdd();
        evenOrOdd.setNumb(6);
        evenOrOdd1.setNumb(7);
        System.out.println(evenOrOdd.evenOrOdd());
        System.out.println(evenOrOdd1.evenOrOdd() + "\n");

        //task #3
        Fact fact = new Fact();
        System.out.println(fact.recursion(6) + "\n");

        //task #4
        ConvertFromCelsiusToFahrenheit convertFromCelsiusToFahrenheit = new ConvertFromCelsiusToFahrenheit();
        convertFromCelsiusToFahrenheit.setFahrenheit(100.0);
        convertFromCelsiusToFahrenheit.setCelsius(-23.0);
        System.out.println(convertFromCelsiusToFahrenheit.convertFromFahrenheitToCelsius());
        System.out.println(convertFromCelsiusToFahrenheit.convertFromCelsiusToFahrenheit() + "\n");

        //task #5
        MaxInArray maxInArray = new MaxInArray();
        System.out.println(maxInArray.fillArray());
        System.out.println(maxInArray.maxInArray() + "\n");

        //task #6
        ReverseString reverseString = new ReverseString("Hello");
        System.out.println(reverseString.reverseString() + "\n");

        //task #7
        Palindrom palindrom = new Palindrom("SOS");
        Palindrom palindrom1 = new Palindrom("SOA");
        System.out.println(palindrom.isPalindrom());
        System.out.println(palindrom1.isPalindrom() + "\n");

        //task #8
        RandNumbGame randNumbGame = new RandNumbGame(1);
        randNumbGame.game();

        //task #9
    }
}
