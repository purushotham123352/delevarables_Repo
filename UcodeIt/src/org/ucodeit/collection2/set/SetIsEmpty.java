package org.ucodeit.collection2.set;

import java.util.HashSet;

public class SetIsEmpty {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("red");
		set.add("blue");
		set.add("green");
		set.add("yellow");
		System.out.println("Set is empty or not "+set.isEmpty());
		set.removeAll(set);
		System.out.println("Set is empty or not "+set.isEmpty());
;
	}

}
