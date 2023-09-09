package org.ucodeit.first;

public class LeadersInArray {
	
	/*
	 * Task10: Write a Java program to print all the LEADERS in the array.
      Note: An element is leader if it is greater than all the elements to its right side.
	 */
    public static void findLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1];

        System.out.print("Leaders in the array: " + maxFromRight + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);
    }
}
