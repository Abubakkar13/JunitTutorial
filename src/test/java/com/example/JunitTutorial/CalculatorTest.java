package com.example.JunitTutorial;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    public static void setUp() {
        System.out.println("Before All");

    }

    @AfterAll
    public static void destroy() {
        System.out.println("After all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each");

    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each");
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "-1, -2, -3",
            "-1, 2, 1"
    })
    void shouldAddNumberCorrectly(int a, int b, int expectedSum) {
        System.out.println("Testing Add");
        long actualSum = calculator.add(a, b);

        assertEquals(expectedSum, actualSum);
    }

    @ParameterizedTest
    @MethodSource("parametersFroAdd")
    void shouldAddNumberCorrectlyWithMethodSource(int a, int b, int expectedSum) {
        System.out.println("Testing Add with method source");
        long actualSum = calculator.add(a, b);

        assertEquals(expectedSum, actualSum);
    }

    public static Stream<Arguments> parametersFroAdd() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(-1, -2, -3)
        );
    }

    @RepeatedTest(3)
    void shouldDivideNumbersCorrectly() {
        System.out.println("Testing divide");
        int actualResult = calculator.divide(10, 5);

        assertEquals(2, actualResult);
    }

    @Test
    void shouldThrowExceptionWhenDenominatorIsZero() {
        System.out.println("Testing divide with throws");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(1, 0));

        assertEquals("Denominator cannot be 0", exception.getMessage());
    }
}