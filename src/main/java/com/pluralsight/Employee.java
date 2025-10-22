package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeID;
    private String employeeName, department;
    private double payRate, hoursWorked, startTime;

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
        LocalDateTime currentTime = LocalDateTime.now();
        this.startTime = currentTime.getHour() + (currentTime.getMinute() / 60);

    }

    public void punchOut(double time) {
        this.hoursWorked += (time - this.startTime);
        this.startTime = 0;
    }

    public void punchOut() {
        LocalDateTime currentTime = LocalDateTime.now();
        double endTime = currentTime.getHour() + (currentTime.getMinute() / 60);

        this.hoursWorked += (endTime - this.startTime);
        this.startTime = -1;
    }

    public void punchTimeCard(double timeIn, double timeOut) {
        this.hoursWorked = timeIn;

        this.hoursWorked = timeOut - this.hoursWorked;
    }

    public void punchTimeCard() {
        LocalDateTime currentTime = LocalDateTime.now();
        double time = currentTime.getHour() + (currentTime.getMinute() / 60);

        if (this.startTime > -1) { //punch out
            this.hoursWorked += (time - this.startTime);
            this.startTime = 0;
        } else {
            this.startTime = time;
        }

    }

}
