public class StringFormat {
    public static void main(String[] args) {
        String name = "Sandeep";
        int marks = 45675;
        System.out.println("Hello " + name +", your marks are: " + marks);

        System.out.printf("Hello %s, your marks are: %0,5d", name, marks);
    }
}
