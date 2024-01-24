package com.maskordev.tasks;

public class EvenOrOdd {
    private Integer numb;

    public Integer getNumb() {
        return numb;
    }

    public void setNumb(Integer numb) {
        this.numb = numb;
    }

    public boolean evenOrOdd() {
        if (getNumb() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
