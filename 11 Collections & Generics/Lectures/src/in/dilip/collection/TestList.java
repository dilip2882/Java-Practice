package in.dilip.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        List<String> strList = new ArrayList<>();

        // Add names to the list
        strList.add("Dilip"); // Adds "Dilip" to the list
        strList.add("Patel"); // Adds "Patel" to the list

        // Insert "middleName" at index 1
        strList.add(1, "middleName");

        // Remove the first element ("Dilip")
        strList.remove(0);

        // Check if "Patel" is in the list and print its index
        if (strList.contains("Patel")) {
            System.out.println("Index of \"Patel\": " + strList.indexOf("Patel"));
        }

        // Print all elements using a loop
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        // Alternatively, use an enhanced for loop
        for (String str : strList) {
            System.out.println(str);
        }
    }
}
