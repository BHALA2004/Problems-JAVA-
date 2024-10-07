package com.zoho;

public class DateFormatter {

        // Format date as a string in dd-mm-yyyy format
        public static String formatDate(MyDate date) {
            return String.format("%02d-%02d-%04d", date.getDay(), date.getMonth(), date.getYear());
        }

}
