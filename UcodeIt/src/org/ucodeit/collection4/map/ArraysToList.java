package org.ucodeit.collection4.map;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysToList {

	public static void main(String[] args) {
		String[] car= {"benz","audi","kia"};
		ArrayList<String> list=new ArrayList<>(Arrays.asList(car));
		for (String string : list) {
			System.out.print(string+" ");
		}
	}

}
