package org.ucodeit.collection4.map;

import java.util.Set;
import java.util.TreeMap;

public class GetAllKeySet {

	public static void main(String[] args) {
		TreeMap<String, String> tree=new TreeMap<>();
		tree.put("a", "purush");
		tree.put("b", "vishnu");
		tree.put("c", "vamsi");
		tree.put("d", "chandu");
		Set<String> set=tree.keySet();
		for (String string : set) {
			System.out.print(string+" ");
		}
		

	}

}
