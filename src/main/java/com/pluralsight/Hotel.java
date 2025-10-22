package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites, numberOfRooms, bookedSuites, bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (this.numberOfRooms > 0) {
            System.out.println("There are " + this.numberOfRooms + " rooms available.");
            System.out.println("Out of those " + this.numberOfRooms + ", there are " + this.bookedBasicRooms + " normal rooms booked");
            System.out.println("There are also " + this.bookedSuites + " suites currently booked.");
            if (numberOfRooms > this.numberOfRooms) {
                System.out.println("You cannot book that many rooms.");
            }
            else if (numberOfRooms < this.numberOfRooms && !isSuite) {
                System.out.println("You are booking " + numberOfRooms + " normal rooms.");
                this.bookedBasicRooms += numberOfRooms;
            }
            return true;
        }
        else {
            System.out.println("There are no more rooms available.");
            return false;
        }
    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }


}
