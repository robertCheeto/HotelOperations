package com.pluralsight;

public class Room {
    private int numBeds;
    private double price;
    private boolean vacant, clean;
    // when creating private boolen values, refrain from calling them isVarName
    // just call the variable name whatever it is so the getter can insert "is" to the front

    public Room(int numBeds, double price) {
        this.numBeds = numBeds;
        this.price = price;
        this.vacant = true;
        this.clean = true;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVacant() {
        return vacant;
    }

    public boolean isClean() {
        return clean;
    }

    // use the this.varName to get the direct instance of vacant AND clean
    // can use isVacant() but calling the method might not yield exact result
    public boolean isAvailable() {
        return (this.vacant && this.clean);
    }

    public void isCheckedIn() {
        this.vacant = false;
        this.clean = false;
    }

    public void isCheckedOut() {
        this.vacant = true;
    }

    public void isCleanRoom() {
        this.clean = true;

        }

    }
