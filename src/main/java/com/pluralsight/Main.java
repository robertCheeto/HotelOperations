package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // testing the Employee Class with an Object called Chris
        Employee Chris = new Employee(1, "Chris Brown", "Management", "Lead Manager", 25.46, 60);

        System.out.println("Chris' pay rate is " + Chris.getPayRate() + ". His salary is $" + Chris.getWage());
        System.out.println("Chris' overtime rate is $" + Chris.getOvertimePay() + ". He worked 60 regular hours which means he worked this many Overtime hours: " + Chris.getOvertimeHours());
        System.out.println("Since Chris worked that many OT hours, his OT salary is $" + Chris.getOvertimeWage());
        System.out.println("The total amount Chris earned is $" + Chris.getTotalWage());

        // testing the Reservation class with a reservation
        //Reservation slot1 = new Reservation("");

        // testing the Room class
        Room room1 = new Room(2, 124.00, true, false);
        System.out.println("");

    }
}
