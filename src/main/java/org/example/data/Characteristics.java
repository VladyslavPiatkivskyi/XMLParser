package org.example.data;

public class Characteristics {
    private int carryingCapacity;
    private int numberOfPassengers;

    public Characteristics(int carryingCapacity, int numberOfPassengers) {
        this.carryingCapacity = carryingCapacity;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
