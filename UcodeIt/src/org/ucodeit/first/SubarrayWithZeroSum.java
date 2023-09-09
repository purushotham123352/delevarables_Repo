package org.ucodeit.first;



public class SubarrayWithZeroSum {
    public static boolean hasZeroSumSubarray(int[] arr) {
        int prefixSum = 0;
        int[] prefixSums = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            prefixSums[i] = prefixSum;

            if (arr[i] == 0 || prefixSum == 0) {
                return true;
            }

            for (int j = 0; j < i; j++) {
                if (prefixSums[j] == prefixSum) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, -2, 3, 4, 5, 6};
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int[] nums3 = {1, 2, -3, 4, 5, 6};

        System.out.println("Does the array contain a subarray with 0 sum (nums1): " + hasZeroSumSubarray(nums1));
        System.out.println("Does the array contain a subarray with 0 sum (nums2): " + hasZeroSumSubarray(nums2));
        System.out.println("Does the array contain a subarray with 0 sum (nums3): " + hasZeroSumSubarray(nums3));
    }
}


