package com.zoho;

public class MyDate {
    private int day;
    private int month;
    private int year;

    // Constructor with validation
    public MyDate(int day, int month, int year) {
        if (DateValidator.isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date");
        }
    }

    // Getters and Setters
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (DateValidator.isValidDate(day, month, year)) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (DateValidator.isValidDate(day, month, year)) {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (DateValidator.isValidDate(day, month, year)) {
            this.year = year;
        }
    }

    // Display the date in a simple format
    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
