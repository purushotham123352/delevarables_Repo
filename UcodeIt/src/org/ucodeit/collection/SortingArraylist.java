package org.ucodeit.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArraylist {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("Before sorting");
		for (String string : list) {
			System.out.print(string+" ");
		} 
		Collections.sort(list);
		System.out.println();
		System.out.println("After sorting");
        for (String string : list) {
			System.out.print(string+" ");
		} 
	}

}
