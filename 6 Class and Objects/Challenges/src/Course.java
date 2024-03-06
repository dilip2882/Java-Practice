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
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName) {
        System.out.println("Student removed");
        enrollments--;
    }

    public static void main(String[] args) {
        Course.setMaxCapacity(100); // Set the max capacity
        Course dsa = new Course("dsa");
        Course webDev = new Course("webDev");
        dsa.enrollStudent("Dilip");
        System.out.println(dsa.enrollments);
    }
}
