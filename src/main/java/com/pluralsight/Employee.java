package com.pluralsight;

public class Employee {
    private int employeeID;
    private String employeeName, department;
    private double payRate, hoursWorked;

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

//    public void setPunchIn(double time) {
//        this.hoursWorked = time;
//    }
//
//    public void setPunchOut(double time) {
//        this.hoursWorked = time - this.hoursWorked;
//    }

    public void punchTimeCard(double timeIn, double timeOut) {
        this.hoursWorked = timeIn;

        this.hoursWorked = timeOut - this.hoursWorked;
    }

}
