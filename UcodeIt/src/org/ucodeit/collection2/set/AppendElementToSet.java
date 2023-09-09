package org.ucodeit.collection2.set;

import java.util.HashSet;

public class AppendElementToSet {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		System.out.println("before Append");
		for (String string : set) {
			System.out.print(string+" ");
		}
		System.out.println();
		set.add("six");
		System.out.println("After Append");
		for (String string : set) {
			System.out.print(string+" ");
		}
	}

}
