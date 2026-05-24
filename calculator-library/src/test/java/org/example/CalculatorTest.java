package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // --- ТЕСТИ ДЛЯ plus ---
    @Test
    @DisplayName("plus: Додавання двох додатних чисел")
    void testPlusPositiveNumbers() {
        assertEquals(5.5, Calculator.plus(2.3, 3.2), "Додавання двох додатних чисел");
    }

    @Test
    @DisplayName("plus: Додавання двох від'ємних чисел")
    void testPlusNegativeNumbers() {
        assertEquals(-5.0, Calculator.plus(-2.0, -3.0), "Додавання двох від'ємних чисел");
    }

    @Test
    @DisplayName("plus: Додавання з нулем")
    void testPlusWithZero() {
        assertEquals(7.0, Calculator.plus(7.0, 0.0), "Додавання з нулем");
    }


    // --- ТЕСТИ ДЛЯ minus ---
    @Test
    @DisplayName("minus: Звичайне віднімання")
    void testMinusStandard() {
        assertEquals(4.0, Calculator.minus(10.0, 6.0), "Звичайне віднімання");
    }

    @Test
    @DisplayName("minus: Віднімання, де результат від'ємний")
    void testMinusResultNegative() {
        assertEquals(-3.0, Calculator.minus(2.0, 5.0), "Віднімання, де результат від'ємний");
    }

    @Test
    @DisplayName("minus: Віднімання від'ємних чисел")
    void testMinusNegativeNumbers() {
        // -5 - (-3) = -5 + 3 = -2
        assertEquals(-2.0, Calculator.minus(-5.0, -3.0), "Віднімання від'ємних чисел");
    }


    // --- ТЕСТИ ДЛЯ multiply ---
    @Test
    @DisplayName("multiply: Звичайне множення")
    void testMultiplyStandard() {
        assertEquals(12.0, Calculator.multiply(3.0, 4.0), "Звичайне множення");
    }

    @Test
    @DisplayName("multiply: Множення будь-якого числа на нуль")
    void testMultiplyByZero() {
        assertEquals(0.0, Calculator.multiply(5.5, 0.0), "Множення будь-якого числа на нуль");
    }

    @Test
    @DisplayName("multiply: Множення від'ємного на додатне")
    void testMultiplyNegativeByPositive() {
        assertEquals(-10.0, Calculator.multiply(-2.0, 5.0), "Множення від'ємного на додатне");
    }

    @Test
    @DisplayName("multiply: Множення двох від'ємних чисел (мінус на мінус)")
    void testMultiplyTwoNegatives() {
        assertEquals(6.0, Calculator.multiply(-2.0, -3.0), "Множення двох від'ємних чисел (мінус на мінус)");
    }


    // --- ТЕСТИ ДЛЯ divide ---
    @Test
    @DisplayName("divide: Ділення націло з дробовим результатом")
    void testDivideStandard() {
        assertEquals(2.5, Calculator.divide(5.0, 2.0), "Ділення націло з дробовим результатом");
    }

    @Test
    @DisplayName("divide: Ділення додатного числа на від'ємне")
    void testDivideNegativeResult() {
        assertEquals(-2.0, Calculator.divide(6.0, -3.0), "Ділення додатного числа на від'ємне");
    }

    @Test
    @DisplayName("divide: Ділення нуля на число")
    void testDivideZeroByNumber() {
        assertEquals(0.0, Calculator.divide(0.0, 5.0), "Ділення нуля на число");
    }

    @Test
    @DisplayName("divide: Ділення на нуль повинно викликати помилку")
    void testDivideByZeroThrowsException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10.0, 0.0);
        }, "Ділення на нуль повинно викликати помилку");
    }
}
