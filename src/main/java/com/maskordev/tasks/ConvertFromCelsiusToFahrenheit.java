package com.maskordev.tasks;

public class ConvertFromCelsiusToFahrenheit {
    private Double celsius;
    private Double Fahrenheit;

    public Double getCelsius() {
        return celsius;
    }

    public void setCelsius(Double celsius) {
        this.celsius = celsius;
    }

    public Double getFahrenheit() {
        return Fahrenheit;
    }

    public void setFahrenheit(Double fahrenheit) {
        Fahrenheit = fahrenheit;
    }

    public double convertFromCelsiusToFahrenheit(){
        return (getCelsius() * 1.8) + 32;
    }

    public double convertFromFahrenheitToCelsius() {
        return (getFahrenheit() - 32) / 1.8;
    }
}
