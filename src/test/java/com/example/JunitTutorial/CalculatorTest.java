package com.example.JunitTutorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void test() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));

        assertEquals("Denominator cannot be 1", exception.getMessage());


    }

}