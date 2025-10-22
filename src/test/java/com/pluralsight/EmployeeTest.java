package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn_time_should_be_current_time() {
        Employee dave = new Employee(1,"dave", "accounting", 12);

        dave.punchIn(10);

        assertEquals(0, dave.getHoursWorked());
        assertEquals(0, dave.getOvertimeHours());
        assertEquals(0, dave.getTotalWage());

    }

    @Test
    void total_hours_worked_time_should_be_zero_after_immediately_punchingIn() {
        Employee dave = new Employee(1,"dave", "accounting", 12);

        dave.punchIn(10);
        dave.punchOut(20);

        assertEquals(10, dave.getHoursWorked());
        assertEquals(0, dave.getOvertimeHours());
        assertEquals(120, dave.getTotalWage());

    }

}