package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeID;
    private String employeeName, department;
    private double payRate, hoursWorked, startTime, endTime;
    private LocalTime currentTime;

    public Employee(int employeeID, String employeeName, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        }
        else {
            return 40;
        }
    }

    public double getOvertimeHours () {
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        }
        return 0;
    }

    public double getTotalWage() {
        double regularWage = this.payRate * this.getHoursWorked();
        double overtimeWage = (this.payRate * 1.5) * this.getOvertimeHours();

        return regularWage + overtimeWage;
    }

    public void punchIn(double time) {
        this.startTime = time;
    }


    public void punchIn() {
        currentTime = LocalTime.now();
        DateTimeFormatter localTimeFormat = DateTimeFormatter.ofPattern("HH.mm");

        String timeString = currentTime.format(localTimeFormat);

        this.startTime = Double.parseDouble(timeString);
        System.out.println(this.startTime);

    }

    public void punchOut(double time) {
        this.hoursWorked += (time - this.startTime);
        this.startTime = 0;
    }

    public void punchOut() {
        currentTime = LocalTime.now();
        DateTimeFormatter localTimeFormat = DateTimeFormatter.ofPattern("HH.mm");

        String timeString = currentTime.format(localTimeFormat);
        this.endTime = Double.parseDouble(timeString);
        System.out.println(this.endTime);

        this.hoursWorked += ((this.endTime + 10) - this.startTime);
        this.startTime = 0;
    }

    public void punchTimeCard(double timeIn, double timeOut) {
        this.hoursWorked = timeIn;

        this.hoursWorked = timeOut - this.hoursWorked;
    }

    public void punchTimeCard() {

    }

}
