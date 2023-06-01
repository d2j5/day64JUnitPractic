package org.example;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number greater than 212: ");
        num = input.nextInt();

        // Check if the entered number represents boiling water
        if (isWaterBoiling(num)) {
            System.out.print("Water is boiling!!!");
        } else {
            System.out.print("Error!");
        }
    }

    // Method to check if the water is boiling
    public static boolean isWaterBoiling(int num) {
        return num >= 212;
    }
}
