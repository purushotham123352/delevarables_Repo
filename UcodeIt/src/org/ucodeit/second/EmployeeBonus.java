package org.ucodeit.second;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = calculateBonus(salary, yearsOfService);

        System.out.println("Net bonus amount: " + bonus);

        scanner.close();
    }

    public static double calculateBonus(double salary, int yearsOfService) {
        if (yearsOfService >= 5) {
            // Calculate bonus as 5% of the salary
            return 0.05 * salary;
        } else {
            return 0; // No bonus if years of service are 5 or less
        }
    }
}

