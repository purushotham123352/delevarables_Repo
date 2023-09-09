package org.ucodeit.collection3.map;

import java.util.HashMap;
import java.util.Set;

public class KeySetMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "ten");
		map.put(4, "six");
		Set set=map.entrySet();
		System.out.println("Map keys are : "+set);

	}

}
