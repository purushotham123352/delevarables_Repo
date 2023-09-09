package org.ucodeit.first;

import java.util.Scanner;

public class PrintOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value from where to print : ");
		int a=sc.nextInt();
		System.out.println("Enter second value where to stop : ");
		int b=sc.nextInt();
		System.out.println("Odd numbers between "+a+" to "+b);
        for(int i=a;i<=b;i++) {
        	if(i%2!=0) {
        		System.out.print(i+" ");
        	}
        }
	}

}
