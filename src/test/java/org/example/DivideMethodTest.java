package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideMethodTest {
    @Test
    void divide_TwoNumbers_ReturnsQuotient() {
        // Arrange
        double num1 = 10.0;
        double num2 = 2.0;
        

        // Act
        DivideMethod Division;
        double actualQuotient = DivideMethod.divide(num1, num2);

        // Assert
        assertEquals(5, actualQuotient);
    }

    @Test
    void divide_DivideByZero_ReturnsInfinity() {
        // Arrange
        double num1 = 5.0;
        double num2 = 0.0;
        double expectedQuotient = Double.POSITIVE_INFINITY;

        // Act
        double actualQuotient = DivideMethod.divide(num1, num2);

        // Assert
        assertEquals(expectedQuotient, actualQuotient);
    }

}