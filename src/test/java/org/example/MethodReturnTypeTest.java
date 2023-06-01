package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodReturnTypeTest {
    @Test
    void string_ReturnsExpectedString() {
        // Arrange
        String expectedString = "Here is the string";

        // Act
        String actualString = MethodReturnType.string();

        // Assert
        assertEquals(expectedString, actualString);
    }

    @Test
    void num_ReturnsExpectedNumber() {
        // Arrange
        int expectedNumber = 13;

        // Act
        int actualNumber = MethodReturnType.num();

        // Assert
        assertEquals(expectedNumber, actualNumber);
    }

    @Test
    void bool_ReturnsExpectedBoolean() {
        // Arrange
        boolean expectedBoolean = true;

        // Act
        boolean actualBoolean = MethodReturnType.bool();

        // Assert
        assertEquals(expectedBoolean, actualBoolean);
    }
}