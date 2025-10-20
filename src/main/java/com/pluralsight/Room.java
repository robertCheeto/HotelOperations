package com.pluralsight;

public class Room {
    private int numBeds;
    private double price;
    private boolean isVacant, isClean;

    public Room(int numBeds, double price, boolean isVacant, boolean isClean) {
        this.numBeds = numBeds;
        this.price = price;
        this.isVacant = isVacant;
        this.isClean = isClean;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVacant() {
        return isVacant;
    }

    public boolean isClean() {
        return isClean;
    }

    public boolean isAvailable() {
        return isVacant && isClean;
    }

}
