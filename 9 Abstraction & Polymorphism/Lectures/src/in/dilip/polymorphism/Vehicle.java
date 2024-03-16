package in.dilip.polymorphism;

public abstract class Vehicle {
    public abstract void start();

    private int noOfTyres;

    Vehicle() {
        this.noOfTyres = 0;
    }

    Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTires() {
        return this.noOfTyres;
    }
}
