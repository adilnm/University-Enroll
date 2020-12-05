package com.cubic;

public class Dog {

	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	public void run() {
		System.out.println(name + " is running");
	}

	public void bark() {
		System.out.println("Hey " + name);
	}
}

interface Jumper<T> {

	public void execute(T t);

}
