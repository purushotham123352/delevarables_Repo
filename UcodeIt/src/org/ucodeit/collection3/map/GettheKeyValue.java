package org.ucodeit.collection3.map;

import java.util.HashMap;

public class GettheKeyValue {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "ten");
		map.put(4, "nine");
		map.put(5, "six");
		String st=(String)map.get(3);
		System.out.println("value is : "+st);

	}

}
