package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoilingWaterTest {
    @Test
    public void testIsWaterBoiling() {
        // Create an instance of the BoilingWater class
        BoilingWater boilingWater = new BoilingWater();

        // Test case 1: Check if water is not boiling at 200 degrees
        assertFalse(boilingWater.isWaterBoiling(200));

        // Test case 2: Check if water is boiling at exactly 212 degrees
        assertTrue(boilingWater.isWaterBoiling(212));

        // Test case 3: Check if water is boiling at a higher temperature (250 degrees)
        assertTrue(boilingWater.isWaterBoiling(250));
    }
}