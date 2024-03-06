class Course {
    static int maxCapacity;
    String courseName;
    String[] enrolledStudents;
    int enrollments;

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    Course(String courseName, int initialEnrollments) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    Course(String courseName) {
        this("Unknown", 0);
    }

    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
        } else {
            System.out.println("Course is already full. Cannot enroll more students.");
        }
    }

    void unenrollStudent(String studentName) {
        int indexToRemove = -1;
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            // Shift elements to the left
            int i = indexToRemove;
            while (i < enrollments - 1) {
                enrolledStudents[i] = enrolledStudents[i + 1];
                i++;
            }
            enrollments--;
            System.out.println("Student " + studentName + " removed.");
        } else {
            System.out.println("Student " + studentName + " not found in the course.");
        }
    }

    public static void main(String[] args) {
        Course.setMaxCapacity(100); // Set the max capacity
        Course dsa = new Course("dsa");
        Course webDev = new Course("webDev");
        dsa.enrollStudent("Dilip");
        dsa.enrollStudent("Raj");
        dsa.enrollStudent("Jack");
        dsa.unenrollStudent("Raj");
        System.out.println(dsa.enrollments);
    }
}
