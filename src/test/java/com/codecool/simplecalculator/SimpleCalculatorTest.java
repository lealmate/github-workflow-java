package com.codecool.simplecalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SimpleCalculatorTest {

    @Test
    public void testIsNumberValid() {
        // test isNumber method with the value: 11
        Float actualResult = SimpleCalculator.isNumber("11");
        Float expectedResult = 11F;
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsNumberNotValid() {
        // test isNumber method with the value: "xyz"
        Float actualResult = SimpleCalculator.isNumber("xyz");
        Float expectedResult = null;
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testIsValidOperatorValid() {
        // test isValidOperator method with the value: "*"
        boolean actualResult = SimpleCalculator.isValidOperator("*");
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void testCalcPlus() {
        // test addition using the calc method with the values: "+", 5, 7
        Float actualResult = SimpleCalculator.calc("+", 5F, 7F);
        Float expectedResult = 12F;
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalcMinus() {
        // test subtraction using the calc method with the values: "-", 5, 7
        Float actualResult = SimpleCalculator.calc("-", 5F, 7F);
        Float expectedResult = -2F;
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalcMultiply() {
        // test multiplication using the calc method with the values: "*", 5, 7
        Float actualResult = SimpleCalculator.calc("*", 5F, 7F);
        Float expectedResult = 35F;
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCalcDivision() {
        // test division using the calc method with the values: "/", 5, 7
        Float actualResult = SimpleCalculator.calc("/", 5F, 7F);
        Float expectedResult = 0.71428573F;
        Assertions.assertEquals(expectedResult,actualResult);
    }

}
