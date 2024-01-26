package com.maskordev.tasks;

public class SimpleNumber {
    private int a;

    public SimpleNumber(int a) {
        this.a = a;
    }

    public boolean isSimpleNumber() {
        if (a <= 1) {
            return false;  // 0 и 1 не считаются простыми числами
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;  // Если число делится нацело, оно не является простым
            }
        }

        return true;  // Если не нашлось делителей, число простое
    }
}