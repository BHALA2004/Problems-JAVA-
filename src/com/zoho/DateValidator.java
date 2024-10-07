package com.zoho;

public class DateValidator {
    public static boolean isValidDate(int day, int month, int year) {
        if (year < 0 || month < 1 || month > 12) {
            return false;
        }
        int[] daysInMonth = { 31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return day > 0 && day <= daysInMonth[month - 1];
    }

    // Check if it's a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
