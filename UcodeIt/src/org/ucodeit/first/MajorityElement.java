package org.ucodeit.first;

public class MajorityElement {
    public static int findMajorityElement(int[] arr) {
        int majorityElement = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == majorityElement) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majorityElement = arr[i];
                    count = 1;
                }
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 2, 2, 5};
        int majority = findMajorityElement(arr);
        System.out.println("Majority element: " + majority);
    }
}

