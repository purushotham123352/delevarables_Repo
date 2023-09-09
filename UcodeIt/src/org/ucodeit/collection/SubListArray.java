package org.ucodeit.collection;

import java.util.ArrayList;
import java.util.List;

public class SubListArray {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("Before");
		for (String string : list) {
			System.out.print(string+" ");
		}
		System.out.println();
		List<String> sublist=list.subList(0, 2);
		System.out.println("After");
		for (String string : sublist) {
			System.out.print(string+" ");
		}
	}

}
