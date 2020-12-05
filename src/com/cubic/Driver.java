package com.cubic;

public class Driver {

	public static void main(String[] args) {

		Jumper<Dog> pso = Dog::run;

		pso.execute(new Dog("Abbas"));

		MySupplier<Vehicle> car = Vehicle::new;

		car.get().show();
	}

}
