package org.ucodeit.third;

public class DuplicatesElements {

	public static void main(String[] args) {
		int[] arr=new int[] {2,5,6,7,83,4,5,2,8,65,43,4,1};
		System.out.println("Duplicate Elements in the array ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			
			}
		}

	}

}
