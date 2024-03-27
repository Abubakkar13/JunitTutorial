package com.example.JunitTutorial;

import javax.naming.OperationNotSupportedException;

import static com.example.JunitTutorial.NotSoSimpleCalculator.Operation.DIVISION;

public class NotSoSimpleCalculator {

    enum Operation {
        ADDITION,
        SUBTRACTION,
        DIVISION
    }

    public long calculate(int a, int b, Operation operation) throws OperationNotSupportedException {
        if (DIVISION.equals(operation) && b == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0");
        }

        switch (operation) {
            case ADDITION:
                return (long) a + b;
            case SUBTRACTION:
                return a - b;
            case DIVISION:
                return a / b;
            default:
                throw new OperationNotSupportedException();
        }
    }
}
