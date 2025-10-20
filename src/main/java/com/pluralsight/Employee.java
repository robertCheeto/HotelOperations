package com.pluralsight;

public class Employee {
    private int employeeID;
    private String employeeName, department, jobTitle;
    private double payRate, hoursWorked;

    public Employee(int employeeID, String employeeName, String department, String jobTitle, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.jobTitle = jobTitle;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getWage() {
        return payRate * 40;
    }

    public double getOvertimeHours () {
        if (hoursWorked > 40) {
            hoursWorked = hoursWorked - 40;
        }
        return hoursWorked;
    }

    public double getOvertimePay () {
        return payRate * 1.5;
    }

    public double getOvertimeWage() {
        return getOvertimePay() * getOvertimeHours();
    }

    public double getTotalWage() {
        return getWage() + getOvertimeWage();
    }
}
