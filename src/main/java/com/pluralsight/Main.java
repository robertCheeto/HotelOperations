package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double userNum;

        // testing the Employee Class with an Object called Chris
        Employee Chris = new Employee(1, "Chris Brown", "Management",  25.46, 60);

        //System.out.println("The total amount Chris earned is $" + Chris.getTotalWage());
        System.out.print("Enter time in: ");
        userNum = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter time out: ");
        double userNum2 = keyboard.nextDouble();
        keyboard.nextLine();
        Chris.punchTimeCard(userNum, userNum2);

        System.out.println(Chris.getHoursWorked() + " <- hours worked");
        System.out.println(Chris.getTotalWage() + " <- total wage");


        // testing the Reservation class with a reservation
        //Reservation slot1 = new Reservation("");

        // testing the Room class
//        Room room1 = new Room(2, 124.00, true, false);
//        System.out.println("Chris manages a hotel and has a room.");
//        System.out.println("The room has " + room1.getNumBeds() + " and it costs $" + room1.getPrice());
//        System.out.println("Is the room Vacant? " + room1.isVacant() + ". Ok but is it available? " + room1.isAvailable());

        // need to change how the program decides the price for the rooms
        // and to say whether or not it is a king or a double
        // need to rework the reservation class and make it so getting the dates for the reservation
        // makes more sense from a program perspective

    }
}
