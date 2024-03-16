package in.dilip.challenge94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    public static void main(String[] args) {
        // Create a priority queue of students, sorted by grade
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getGrade() - student2.getGrade();
            }
        });

        // Add students to the queue
        queue.offer(new Student("Dilip", 'A')); // Adds Dilip with grade A
        queue.offer(new Student("Ram", 'B')); // Adds Ram with grade B
        queue.offer(new Student("Shyam", 'D')); // Adds Shyam with grade D
        queue.offer(new Student("Mohan", 'B')); // Adds Mohan with grade B
        queue.offer(new Student("Sachin", 'B')); // Adds Sachin with grade B

        // Print the contents of the queue
        System.out.printf("Queue is %s\n", queue);

        // Retrieve and print students in order of priority
        System.out.printf("Got %s\n", queue.poll()); // Removes and prints Dilip
        System.out.printf("Got %s\n", queue.poll()); // Removes and prints Mohan
        System.out.printf("Got %s\n", queue.poll()); // Removes and prints Ram
        System.out.printf("Got %s\n", queue.poll()); // Removes and prints Sachin
        System.out.printf("Got %s\n", queue.poll()); // Removes and prints Shyam
    }

    // Student class with name and grade
    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }
}
