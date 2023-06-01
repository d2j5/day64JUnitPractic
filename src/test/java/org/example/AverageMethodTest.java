package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageMethodTest {
    @Test
    void sum_ThreeIntegers_ReturnsSum() {
        // Arrange
        var calculator = new AverageMethod();

        // Act
        int sum = calculator.sum(2, 2, 2);

        // Assert
        assertEquals(6, sum);
    }

    @Test
    void average_ThreeIntegers_ReturnsAverage() {
        // Arrange
        var averageResult = new AverageMethod();

        // Act
        int average = (int) averageResult.average(2, 2, 2);

        // Assert
        assertEquals(2, average);
    }
}