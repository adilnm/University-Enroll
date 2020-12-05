package com.cubic;

public class Vehicle {
	String name = "Audi";

	public void show() {
		System.out.println("Name: " + name);
	}

}

interface MySupplier<T> {
	public T get();
}