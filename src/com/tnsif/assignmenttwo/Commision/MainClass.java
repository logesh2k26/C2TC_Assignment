package com.tnsif.assignmenttwo.Commision;

public class MainClass {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student();

        // Create Commission object and test
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}
