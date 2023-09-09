package org.ocodeit.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Completable {

	public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("purush");
	list.add("vishnu");
	list.add("vandana");
	CompletableFuture<Void> future=CompletableFuture.runAsync(()->{
		for (String string : list) {
			System.out.println(string);
		}
	});
	future.join();
	}

}
