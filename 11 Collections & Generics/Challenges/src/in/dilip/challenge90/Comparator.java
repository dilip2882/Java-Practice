package in.dilip.challenge90;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Comparator {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> list = Arrays.asList("Bear", "Zebra", "Lion", "Ant");

        // Print the initial list
        System.out.println(list);

        // Sort the list in descending order based on the first character
        sortInDescending(list);

        // Print the sorted list
        System.out.println(list);
    }

    // Sort the list in descending order based on the first character
    public static void sortInDescending(List<String> stringList) {
        // Sort the list in descending order based on the first character
        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if (s.equals(t1)) {
                    return 0; // Equal strings
                } else if (s.charAt(0) < t1.charAt(0)) {
                    return 1; // s comes after t1
                } else {
                    return -1; // s comes before t1
                }
            }
        });
    }

}
