package in.dilip.challenge96;

public class EnumTest {
    public static void main(String[] args) {
//        System.out.println(Day.MONDAY);
        System.out.println("Printing all the days of the week");
        for (Day value : Day.values()) {
            System.out.println(value);

        }
    }
}
