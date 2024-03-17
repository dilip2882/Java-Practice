public class CarFinal {
    final int noOfWheels;
    final String model;
    final String engineInLiters;

    public CarFinal(int noOfWheels, String model, String engineInLiters) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiters = engineInLiters;
    }

    @Override
    public String toString() {
        return "No of Wheels: " + noOfWheels + ", Model: " + model + ", Engine in Liters: " + engineInLiters;
    }

    public static void main(String[] args) {
        CarFinal cf = new CarFinal(4, "ALto", "20l");
        System.out.println(cf);
    }
}
