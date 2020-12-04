package com.cubic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");

		System.out.println(list);

//		list.forEach(System.out::println);

		List<String> friuts = Arrays.asList("1", "2", "3ß");

		System.out.println(friuts);

		Stream<String> streams = list.stream();
		streams.forEach(System.out::println);
	}
}