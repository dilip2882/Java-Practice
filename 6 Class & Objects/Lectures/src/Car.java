public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeasts;

    Car() {
        this("Black");
        currentFuelInLitres = 5;
    }

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 220;
        currentFuelInLitres = 2;
        noOfSeasts = 5;
    }

    public Car start() {
        if (currentFuelInLitres == 0) {
            System.out.println("Car is out of fuel, can not start");
        } else if (currentFuelInLitres < 5){
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is started.. bruhhh..");
        }
        return this;
    }

    public void drive() {
        currentFuelInLitres--;
        System.out.println("Car is driving");
    }

//    public void addFuel(float fuel) {
//        currentFuelInLitres += fuel;
//    }

    public void addFuel(float currentFuelInLitres) {
        this.currentFuelInLitres += currentFuelInLitres;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLitres;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm in finalize");
    }
}