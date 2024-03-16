package in.dilip.enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.GREEN;

        Grade grade = Grade.C;
        Grade grade1 = Grade.valueOf("D");
        System.out.println(grade1);

        for (Grade value : Grade.values()) {
            System.out.print(value);
        }


    }
}
