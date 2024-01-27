package com.maskordev.tasks;

public class ConverterSS {
    private Integer decimalNumber;

    public ConverterSS(Integer decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    public String fromDecimalToBinary() {
        StringBuilder binaryNumberBuilder = new StringBuilder();
        while(decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumberBuilder.insert(0, remainder);
            decimalNumber /= 2;
        }
        return binaryNumberBuilder.toString();
    }
}
