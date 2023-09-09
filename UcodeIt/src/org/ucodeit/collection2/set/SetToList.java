package org.ucodeit.collection2.set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class SetToList {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("red");
		set.add("blue");
		set.add("green");
		set.add("yellow");
		List<String> list=new LinkedList<String>(set);
		System.out.println("list elements are :"+list);

	}

}
