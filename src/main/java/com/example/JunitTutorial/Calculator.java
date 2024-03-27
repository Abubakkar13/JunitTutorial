package com.example.JunitTutorial;

public class Calculator {

    public long add(int a, int b) {
        return (long) a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0");
        }

        return a / b;
    }
}
