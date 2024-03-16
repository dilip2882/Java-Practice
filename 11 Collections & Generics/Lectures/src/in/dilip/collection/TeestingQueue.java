package in.dilip.collection;

import java.util.LinkedList;
import java.util.Queue;

public class TeestingQueue {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(1); // Adds 1 to the end of the queue
        queue.offer(2); // Offers 2 to the end of the queue

        // Print the contents of the queue
        Utility.print(queue);

        // Peek at the first element (does not remove it)
        System.out.println("Peek: " + queue.peek());

        // Get the first element using element() method (throws exception if empty)
        System.out.println("Element: " + queue.element());

        // Remove and print the first element
        System.out.println("Removed element: " + queue.remove());
        Utility.print(queue);

        // Poll the first element (returns null if empty)
        System.out.println("Polled element: " + queue.poll());
        Utility.print(queue);

        // Poll again (returns null if empty)
        System.out.println("Polled element: " + queue.poll());

        // Attempt to remove an element (throws exception if empty)
        System.out.println("Removed element: " + queue.remove());
    }
}
