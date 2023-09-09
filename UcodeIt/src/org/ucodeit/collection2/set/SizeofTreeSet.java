package org.ucodeit.collection2.set;

import java.util.TreeSet;

public class SizeofTreeSet {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		System.out.println("size of tree : "+set.size());
	}

}
