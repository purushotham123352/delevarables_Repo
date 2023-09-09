package org.ucodeit.second;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication table of " + num );

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }

        scanner.close();
    }
}

