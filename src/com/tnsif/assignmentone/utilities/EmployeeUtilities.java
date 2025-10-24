package com.tnsif.assignmentone.utilities;

import com.tnsif.assignmentone.employees.Employee;


public class EmployeeUtilities {

    /**
     * Displays employee details.
     */
    public static void showEmployeeDetails(Employee emp) {
        System.out.println("----- Employee Details -----");
        emp.displayInfo();
        System.out.println("-----------------------------");
    }

    /**
     * Calculates annual bonus (10% of salary).
     */
    protected static double calculateBonus(Employee emp) {
        return emp.getSalary() * 0.10;
    }

    /**
     * Displays the calculated bonus.
     */
    public static void printBonus(Employee emp) {
        System.out.println("Bonus for " + emp.getName() + ": " + calculateBonus(emp));
    }
}