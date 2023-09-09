package org.ucodeit.collection2.set;

import java.util.TreeSet;

public class CompareTwoTreeSet {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("nine");
		
		TreeSet<String> set2=new TreeSet<>();
		set2.add("one");
		set2.add("seven");
		set2.add("three");
		set2.add("four");
		
		for (String string : set) {
			System.out.println(set2.contains(string)?"yes":"no");
		}
	}

}
