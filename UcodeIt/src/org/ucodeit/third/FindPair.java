package org.ucodeit.third;

public class FindPair {
    public static void findPairs(int[] arr, int targetSum) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8};
        int targetSum = 10;

        System.out.println("Pairs with sum " + targetSum + ":");
        findPairs(arr, targetSum);
    }
}

