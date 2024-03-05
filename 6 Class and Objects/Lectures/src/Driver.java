public class Driver {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.addFuel(6);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.addFuel(3);
        System.out.println(myCar.getCurrentFuelLevel());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
    }
}
