public class Driver {

    static int minAgeForDriving = 18;

    String name;
    int age;
    String dateOfLisensse;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());
//        myCar.addFuel(3);
//        System.out.println(myCar.getCurrentFuelLevel());
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        Car swift = new Car("Red");
        Car thar = new Car();
        swift.addFuel(6);
//        swift.start();
//        Car startedCar = swift.start();
//        swift.drive();
        swift.start().drive();
        System.out.println(swift.currentFuelInLitres);
        System.out.println(swift.color);

        Driver myDriver = new Driver();
        myDriver.dateOfLisensse = "2/Jan/2002";
        System.out.println(myDriver.dateOfLisensse);
    }
}
