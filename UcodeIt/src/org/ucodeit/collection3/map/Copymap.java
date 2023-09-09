package org.ucodeit.collection3.map;

import java.util.HashMap;

public class Copymap {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		HashMap<Integer, String> map2=new HashMap<>();
		map2.put(1, "leven");
		map2.put(2, "six");
		map2.put(3, "nine");
		map2.put(4, "ten");
		map2.putAll(map);
		System.out.println(map2);


	}

}
