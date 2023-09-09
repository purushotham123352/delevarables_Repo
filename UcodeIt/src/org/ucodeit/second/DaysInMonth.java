package org.ucodeit.second;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        int daysInMonth = getDaysInMonth(month, year);

        if (daysInMonth != -1) {
            System.out.println("Number of days in the selected month: " + daysInMonth);
        } else {
            System.out.println("Invalid month or year input.");
        }

        scanner.close();
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1) {
            return -1; // Invalid input
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29; // February has 29 days in a leap year
                } else {
                    return 28; // February has 28 days in a non-leap year
                }
            default:
                return -1; // Invalid input
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

