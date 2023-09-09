package org.ucodeit.first;

public class PrintSubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        int[] nums2 = {1, 2, -3, 4, 5, 6};
        int[] nums3 = {1, 2, -2, 3, 4, 5, 6};

        findSubarraysWithZeroSum(nums1);
        findSubarraysWithZeroSum(nums2);
        findSubarraysWithZeroSum(nums3);
    }

    public static void findSubarraysWithZeroSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    printSubarray(arr, i, j);
                }
            }
        }
    }

    public static void printSubarray(int[] arr, int start, int end) {
        System.out.print("Sub-arrays with 0 sum : [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

