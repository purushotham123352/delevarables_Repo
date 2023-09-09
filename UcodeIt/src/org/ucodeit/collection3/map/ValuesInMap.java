package org.ucodeit.collection3.map;

import java.util.HashMap;

public class ValuesInMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "ten");
		map.put(4, "six");
		System.out.println("map value are : "+map.values());
	}

}
