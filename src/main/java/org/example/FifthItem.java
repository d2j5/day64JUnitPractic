package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string;
        ArrayList<String> myString = new ArrayList<>();

        System.out.println("Enter a word: ");

        while (true) {
            string = input.nextLine();
            myString.add(string);
            System.out.println("Enter a word: (Press enter to end)");

            if (string.isEmpty()) {
                System.out.println("Game Over!");
                break;
            }
        }

        String fifthItem = getFifthItem(myString);
        if (fifthItem != null) {
            System.out.println("The fifth item is: " + fifthItem);
        }
    }

    public static String getFifthItem(ArrayList<String> list) {
        if (list.size() >= 5) {
            return list.get(4);
        }
        return null;
    }
}
