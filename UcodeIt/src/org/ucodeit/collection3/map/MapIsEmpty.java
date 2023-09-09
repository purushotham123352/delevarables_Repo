package org.ucodeit.collection3.map;

import java.util.HashMap;

public class MapIsEmpty {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");

		map.put(3, "three");
		System.out.println("map is empty "+map.isEmpty());
		map.clear();
		System.out.println("map is empty "+map.isEmpty());
		


	}

}
