public class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Prashant";
        String lastName = "Jain";
//        String fullName = firstName + " " + lastName;
        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());

    }
}
