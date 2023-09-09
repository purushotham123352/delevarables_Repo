package org.ucodeit.third;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] arr=new int[] {2,5,6,7,83,48,65,43,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
		System.out.println();
	
	
			
			System.out.println("Second largest element is : "+arr[1]);	
		
		

	}

}
