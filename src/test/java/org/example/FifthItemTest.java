package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FifthItemTest {
    @Test
    public void testGetFifthItem() {
        // Create an instance of the FifthItem class
        FifthItem fifthItem = new FifthItem();

        // Create an ArrayList and add some elements to it
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Date");
        myList.add("Elderberry");
        myList.add("Fig");

        // Call the getFifthItem() method and store the result in actual
        String actual = fifthItem.getFifthItem(myList);

        // Define the expected result
        String expected = "Elderberry";

        // Check if the actual result matches the expected result
        assertEquals(expected, actual);
    }
}







