package org.ucodeit.collection2.set;

import java.util.TreeSet;

public class IteratingTreeset {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		for (String string : set) {
			System.out.println(string);
		}
		
	}

}
