package org.ucodeit.second;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer for n.");
        } else {
            System.out.println("First " + n + " natural numbers:");

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
                sum += i;
            }

            System.out.println("\nSum of the first " + n + " natural numbers: " + sum);
        }

        scanner.close();
    }
}

