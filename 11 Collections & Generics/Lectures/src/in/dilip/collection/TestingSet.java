package in.dilip.collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        // Create a HashSet to store names
        Set<String> names = new HashSet<>();

        // Add names to the set
        System.out.println(names.add("Dilip")); // Adds "Dilip" to the set
        System.out.println(names.add("Sachin")); // Adds "Sachin" to the set
        System.out.println(names.add("Rohit")); // Adds "Rohit" to the set

        // Print the contents of the set
        Utility.print(names);

        // Attempt to add "Dilip" again (already exists, so returns false)
        System.out.println(names.add("Dilip"));

        // Get the size of the set
        System.out.println("Size of the set: " + names.size());

        // Check if "Dilip" is in the set
        System.out.println("Contains \"Dilip\": " + names.contains("Dilip"));

        // Remove "Dilip" from the set
        System.out.println("Removed \"Dilip\": " + names.remove("Dilip"));
        Utility.print(names);

        // Attempt to remove "Dilip" again (already removed, so returns false)
        System.out.println("Removed \"Dilip\" again: " + names.remove("Dilip"));
    }
}
