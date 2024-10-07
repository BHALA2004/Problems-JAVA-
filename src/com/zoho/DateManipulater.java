package com.zoho;

public class DateManipulater {
    public static void addDays(MyDate date, int days) {
        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();

        while (days > 0) {
            int daysInCurrentMonth = DateValidator.isLeapYear(year) && month == 2 ? 29 : daysInMonth(month);
            if (day + days <= daysInCurrentMonth) {
                day += days;
                break;
            } else {
                days -= (daysInCurrentMonth - day + 1);
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
        }
        date.setDay(day);
        date.setMonth(month);
        date.setYear(year);
    }

    // Subtract days from the current date
    public static void subtractDays(MyDate date, int days) {
        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();

        while (days > 0) {
            if (day > days) {
                day -= days;
                break;
            } else {
                days -= day;
                month--;
                if (month < 1) {
                    month = 12;
                    year--;
                }
                day = daysInMonth(month);
            }
        }
        date.setDay(day);
        date.setMonth(month);
        date.setYear(year);
    }

    // Get the number of days in a month
    private static int daysInMonth(int month) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return daysInMonth[month - 1];
    }
}
