package org.ucodeit.collection2.set;

import java.util.HashSet;

public class RemoveElementsFromSet {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		System.out.println("Before removing");
		for (String string : set) {
			System.out.print(string+" ");
		}
		set.removeAll(set);
		System.out.println();
		System.out.println("After removing");
		for (String string : set) {
			System.out.print(string+" ");
		}

	}

}
