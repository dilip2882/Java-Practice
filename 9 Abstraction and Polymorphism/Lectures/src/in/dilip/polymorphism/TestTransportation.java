package in.dilip.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
//        Vehicle v = new Vehicle();
        Plane p = new Plane();

//        carTest(v);
        carTest(c);
        carTest(p);

//        Vehicle vCar = new Car();
//        Car cVehicle = (Car) new Vehicle();

//        Object ref = new Vehicle(); //Object is the parent of all classes

    }
    private static void carTest(Vehicle veh) {
//         Car cVehicle = (Car) veh;
//         veh.noOfDoors();
         veh.start();
//         cVehicle.noOfDoors();



//        if (veh instanceof Car) {
////            Car cVehicle = (Car) veh;
////            veh.noOfDoors();
//            veh.start();
////            cVehicle.noOfDoors();
//        } else {
//            System.out.println("Not a Car!");
//        }
    }
}


