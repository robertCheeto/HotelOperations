package com.pluralsight;

public class Employee {
    private int employeeID;
    private String employeeName, department, jobTitle;
    private double wage, hoursWorked;

    public Employee(int employeeID, String employeeName, String department, String jobTitle, double wage, double hoursWorked) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.jobTitle = jobTitle;
        this.wage = wage;
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

    public double getWage() {
        return wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
