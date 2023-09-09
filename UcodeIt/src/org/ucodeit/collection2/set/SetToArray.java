package org.ucodeit.collection2.set;

import java.util.HashSet;

public class SetToArray {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("red");
		set.add("blue");
		set.add("green");
		set.add("yellow");
		String[] st=new String[set.size()];
	     set.toArray(st);
	     System.out.println("Array elements are :");
	     for (String string : st) {
			System.out.print(string+" ");
		}
	}

}
