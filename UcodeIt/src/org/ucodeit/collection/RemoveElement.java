package org.ucodeit.collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println("Before removing");
		for (String string : list) {
			System.err.print(string+" ");
		}
		list.remove(2);
		System.out.println("After removing");
		for (String string : list) {
			System.err.print(string+" ");
		}
	}

}
