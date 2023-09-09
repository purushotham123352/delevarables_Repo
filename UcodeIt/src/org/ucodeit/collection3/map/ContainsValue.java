package org.ucodeit.collection3.map;

import java.util.HashMap;

public class ContainsValue {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("ten", 3);
		if(map.containsValue(3)) {
			System.out.println("yes have 3");
		}
		else {
			System.out.println("no ");
		}
		if(map.containsKey(4)) {
			System.out.println("yes have 4");
		}
		else {
			System.out.println("no ");
		}

	}

}
