package org.ucodeit.first;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;//1234,123,12,1
        }

        System.out.println("Sum of digits: " + sum);
    }
}

