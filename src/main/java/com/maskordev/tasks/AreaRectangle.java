package com.maskordev.tasks;

public class AreaRectangle {
    private Integer a;
    private Integer b;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public int calcArea() {
        return getA() * getB();
    }
}
