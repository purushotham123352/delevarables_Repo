package org.ucodeit.third;

public class FindMaxMin {

	public static void main(String[] args) {
		int[] arr=new int[] {2,5,6,7,83,4,5,2,8,65,43,4,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		System.out.println("Minimum values in the array = "+arr[0]);
		System.out.println("Maximum values in the array = "+arr[arr.length-1]);

	}

}
