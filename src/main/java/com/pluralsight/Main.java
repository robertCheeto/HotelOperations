package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // testing the Employee Class with an Object called Chris
        Employee Chris = new Employee(1,"Chris Brown","Management",10,0);

//        System.out.println("The total amount Chris earned is $" + Chris.getTotalWage());
//        System.out.print("Enter time in: ");
//        double userNum = keyboard.nextDouble();
//        keyboard.nextLine();
//        System.out.print("Enter time out: ");
//        double userNum2 = keyboard.nextDouble();
//        keyboard.nextLine();
//        Chris.punchTimeCard(userNum, userNum2);

//        Chris.punchIn();
//        Chris.punchOut();
//
//        System.out.println(Chris.getHoursWorked() + " <- hours worked");
//        System.out.println(Chris.getOvertimeHours() + "<- OT hours (if any)");
//        System.out.println(Chris.getTotalWage() + " <- total wage");

//        // testing the Room class
//        Room room1 = new Room(2, 124.00, true, false);
//        System.out.println("\nChris manages a hotel and has a room.");
//        System.out.println("The room has " + room1.getNumBeds() + " and it costs $" + room1.getPrice());
//        System.out.println("Is the room Vacant? " + room1.isVacant() + ". Ok but is it available? " + room1.isAvailable());
//        System.out.println("Is the room clean?" + room1.isClean());
//        System.out.println("\ntesting if the room is checked in: " + room1.isCheckedIn());
//        System.out.println("testing if the room is checked out: " + room1.isCheckedOut());
//        System.out.println("testing if the room is dirty: " + room1.isDirtyRoom());

        // testing the Hotel class
//            public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
//            this.name = name;
//            this.numberOfSuites = numberOfSuites;
//            this.numberOfRooms = numberOfRooms;
//            this.bookedSuites = bookedSuites;
//            this.bookedBasicRooms = bookedBasicRooms;
        Hotel BestWestern = new Hotel("BW1", 10,20,3,5);
//        BestWestern.bookRoom(5,false);
        System.out.println(BestWestern.bookRoom(5,false));
        System.out.println("The hotel now has the following rooms remaining: " + BestWestern.getBookedBasicRooms());
        System.out.println("The hotel now has the following suites remaining: " + BestWestern.getBookedSuites());
        System.out.println("The hotel has this many rooms total: " + BestWestern.getNumberOfRooms());
        System.out.println("The hotel has this many suites available: " + BestWestern.getAvailableSuites());
        System.out.println("The hotel has this many rooms available: " + BestWestern.getAvailableRooms());

    }
}
