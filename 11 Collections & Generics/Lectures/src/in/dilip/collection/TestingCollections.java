package in.dilip.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        List<Integer> numList = new ArrayList<>();

        // Add integers to the list
        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(-76);

        // Print the initial list
        Utility.print(numList);

        // Sort the list in ascending order
        Collections.sort(numList);
        Utility.print(numList);

        // Reverse the list
        Collections.reverse(numList);
        Utility.print(numList);

        // Create an unmodifiable view of the list
        List<Integer> unmodifiable = Collections.unmodifiableList(numList);

        // Attempt to add an element to the unmodifiable list (will throw an exception)
        // unmodifiable.add(33);
    }
}
