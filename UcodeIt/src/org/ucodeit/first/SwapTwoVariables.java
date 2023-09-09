package org.ucodeit.first;

import java.util.Scanner;

public class SwapTwoVariables {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first value : ");
	int a=sc.nextInt();
	System.out.println("Enter second value : ");
	int b=sc.nextInt();
	System.out.println("Before swapping a value= "+a+" b value="+b);
	a=a+b;//a=11
	b=a-b;//b=5
	a=a-b;//a=(11-5)=6
	System.out.println("Before swapping a value= "+a+" b value="+b);
	}

}
