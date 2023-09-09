package org.ucodeit.collection3.map;

import java.util.HashMap;
import java.util.Map;

public class CreatehashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		for (Map.Entry m : map.entrySet()) {
			System.out.print(m.getKey()+" "+m.getValue());
			System.out.println();
		}
		

	}

}
