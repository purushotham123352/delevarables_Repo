package org.ucodeit.third;

public class RevesreArray {

	public static void main(String[] args) {
		int[] arr=new int[] {1,4,5,3,2,6,9,8,7,6,4};
		int rev[]= new int[arr.length];
		int n=arr.length-1;
		System.out.println("Before Reversing");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			rev[n]=arr[i];
			n--;
		}
		
		System.out.println("After Reversing");
		for(int i=0;i<arr.length;i++) {
		System.out.print(rev[i]+" ");
		}
	}

}
