package in.dilip.challenge81;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Dilip", 30, "001");
        Person person2 = new Person("Dilip", 37, "001");

//        if (person1 == person2) {    // reference equal check
//            System.out.println("Equals");
//        } else {
//            System.out.println("Not equal");
//        }

        if (person1.equals(person2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equal");
        }
    }
}
