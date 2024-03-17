package in.dilip.challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Dilip Patel", 22, 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployeeDetails());
    }
}
