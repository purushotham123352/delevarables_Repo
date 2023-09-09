package org.ucodeit.collection4.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapIterator {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<>();
		map.put("a", "purush");
		map.put("c", "vamsi");
		
		map.put("b", "vishnu");
		map.put("d", "chandu");
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println("key "+s+" value is : "+map.get(s));
		}

	}

}
