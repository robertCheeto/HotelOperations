package com.pluralsight;

public class Room {
    private int numBeds;
    private double price;
    private boolean vacant, clean;
    // when creating private boolen values, refrain from calling them isVarName
    // just call the variable name whatever it is so the getter can insert "is" to the front

    public Room(int numBeds, double price, boolean vacant, boolean clean) {
        this.numBeds = numBeds;
        this.price = price;
        this.vacant = vacant;
        this.clean = clean;
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

    public boolean isCheckedIn() {
        return (!this.vacant);
    }

    public boolean isCheckedOut() {
        return (this.vacant && !this.clean);
    }

    public boolean isDirtyRoom() {
            return (isCheckedOut() && !isAvailable());
        }

    }
