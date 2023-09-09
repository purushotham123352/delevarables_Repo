package org.ucodeit.first;

public class SumOff100Prime {
    public static int prime(int num) {
        if (num <= 1) {
            return 0;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += prime(i);
        }
        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }
}
