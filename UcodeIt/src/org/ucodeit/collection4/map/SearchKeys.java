package org.ucodeit.collection4.map;

import java.util.TreeMap;

public class SearchKeys {

	public static void main(String[] args) {
		TreeMap<String,String> tree=new TreeMap<>();
		tree.put("a", "purush");
		tree.put("b", "vamsi");
		tree.put("c", "vishnu");
		tree.put("d", "vivek");
		if(tree.containsKey("d")) {
			System.out.println("yes it is");
		}
		else {
			System.out.println("no");
		}
		if(tree.containsKey("e")) {
			System.out.println("yes it is");
		}
		else {
			System.out.println("no");
		}

	}

}
