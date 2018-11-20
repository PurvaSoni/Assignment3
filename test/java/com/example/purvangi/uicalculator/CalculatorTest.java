package com.example.purvangi.uicalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c;
    //Member variable

    @Before
    public void setUp() throws Exception {
        c = new Calculator();
    }

    // TEST CASES FOR ADDITION

    @Test

    public void testAddition_input6and6_output12() throws Exception {
        // 1. Arrange
        double i = 6;
        double j = 6;

        // 2. Act
        double result = c.addition(i, j);

        // 3. Assert
        assertEquals(12.0, result, 1);
    }

    @Test

    public void testAddition_input1and2_output3() throws Exception {
        // 1. Arrange
        double i = 1;
        double j = 2;

        // 2. Act
        double result = c.addition(i, j);

        // 3. Assert
        assertEquals(3.0, result, 1);
    }


    @Test

    public void testAddition_fiveAndNegativeSevenPointFive_negativeTwoPointFive() throws Exception {
        // 1. Arrange
        double i = 5.0;
        double j = -7.5;

        // 2. Act
        double result = c.addition(i, j);

        // 3. Assert
        assertEquals(-2.5, result, 1);
    }

    @Test

    public void testSubtraction_5and2_3() throws Exception {
        // 1. Arrange
        double i = 5;
        double j = 2;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(3.0, result, 1);
    }

    @Test

    public void testSubtraction_negative11AndNegative7_negative4() throws Exception {
        // 1. Arrange
        double i = -11;
        double j = -7;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(-4.0, result, 1);
    }

    @Test

    public void testSubtraction_0and0_0() throws Exception {
        // 1. Arrange
        double i = 0;
        double j = 0;

        // 2. Act
        double result = c.subtraction(i, j);

        // 3. Assert
        assertEquals(0.0, result, 1);
    }

    // TEST CASES FOR MULTIPLICATION

    @Test

    public void testMultiplication_200And2_400() throws Exception {
        // 1. Arrange
        double i = 200;
        double j = 2;

        // 2. Act
        double result = c.multiplication(i, j);

        // 3. Assert
        assertEquals(400.0, result, 1);
    }

    @Test

    public void testMultiplication_Negative15_Negative3_Positive45() throws Exception {
        // 1. Arrange
        double i = -15;
        double j = -3;

        // 2. Act
        double result = c.multiplication(i, j);

        // 3. Assert
        assertEquals(45.0, result, 1);
    }

    @Test

    public void testMultiplication_2And0_0() throws Exception {
        // 1. Arrange
        double i = 2;
        double j = 0;

        // 2. Act
        double result = c.multiplication(i, j);

        // 3. Assert
        assertEquals(0.0, result, 1);
    }

    // TEST CASES FOR DIVISION

    @Test
    public void testDivision_10and5_2() throws Exception {
        // 1. Arrange
        double i = 10;
        double j = 5;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(2.0, result, 1);
    }

    @Test

    public void testDivision_0And3_0() throws Exception {
        // 1. Arrange
        double i = 0;
        double j = 3;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(0.0, result, 1);
    }


    @Test

    public void testDivision_Negative25AndNegative10_2Point5() throws Exception {
        // 1. Arrange
        double i = -25;
        double j = -10;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(2.5, result, 1);
    }

    @Test

    public void testDivision_1And1_1() throws Exception {
        // 1. Arrange
        double i = 1;
        double j = 1;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(1.0, result, 1);
    }

    @Test

    public void testDivision_2And1_1() throws Exception {
        // 1. Arrange
        double i = 2;
        double j = 1;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(2.0, result, 1);
    }

    @Test

    public void testDivision_9And3_3() throws Exception {
        // 1. Arrange
        double i = 9;
        double j = 3;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(3.0, result, 1);
    }
}
