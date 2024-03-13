

public class StudentToString {
        String name;
        int age;
        String rollNumber;
        String house;

    public StudentToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details:{name:" + name
                + ", age:" + age
                + ", rollNumber:"
                + rollNumber
                + ", house:" + house + " }";
    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("Prashant", 45, "2999", "Antila");
        System.out.println(stu);
    }
}
