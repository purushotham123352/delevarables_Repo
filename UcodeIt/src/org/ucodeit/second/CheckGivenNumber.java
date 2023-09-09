package org.ucodeit.second;

import java.util.Scanner;

public class CheckGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Given number is positive");
		}
		else {
			System.out.println("Given Number is Negitive");
		}

	}

}
