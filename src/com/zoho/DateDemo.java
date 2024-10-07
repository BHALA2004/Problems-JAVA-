package com.zoho;

public class DateDemo {
    public static void main(String[] args) {
        MyDate date = new MyDate(17, 6, 1998);
        date.displayDate(); // Output: 28/2/2020


        DateManipulater DateManipulator = null;
        DateManipulator.addDays(date, 25); // Moves to March 2, 2020
        date.displayDate(); // Output: 2/3/2020


        // Output: 26-02-2020
    }
}
