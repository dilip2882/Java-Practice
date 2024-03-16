package in.dilip.wrapper;

public class TestingWrapper {
    public static void main(String[] args) {
        Integer first = 55;
        Integer second = Integer.valueOf("42");
        System.out.println(first);
        System.out.println(second);

        int third = first;    // Unboxing
        System.out.println(third);

    }
}
