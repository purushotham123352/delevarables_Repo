package org.ucodeit.second;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {
            // Print numbers from 1 to i on each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}

