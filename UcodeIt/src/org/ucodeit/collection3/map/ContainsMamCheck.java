package org.ucodeit.collection3.map;

import java.util.HashMap;

public class ContainsMamCheck {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("ten", 3);
		if(map.containsKey("two")) {
			System.out.println("yes have two");
		}
		else {
			System.out.println("no ");
		}
		if(map.containsKey("four")) {
			System.out.println("yes have two");
		}
		else {
			System.out.println("no ");
		}
	}

}
