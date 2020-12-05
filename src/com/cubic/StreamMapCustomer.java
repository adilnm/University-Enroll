package com.cubic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Car {
	private String name;
	private String email;
	private int age;

	public Car(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", age=" + age + "]";
	}

}

class Hola {
	private String name;
	private String email;

	public Hola(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Hola [name=" + name + ", email=" + email + "]";
	}

}

public class StreamMapCustomer {
	public static void main(String[] args) {

		Car c1 = new Car("Audi", "audi@gmail.com", 23);
		Car c2 = new Car("BMW", "bmw@gmail.com", 12);
		Car c3 = new Car("Maruti", "Maruti@gmail.com", 33);
		Car c4 = new Car("Toyota", "toyota@gmail.com", 3);
		Car c5 = new Car("Nissan", "nissan@gmail.com", 4);
		Car c6 = new Car("Ford", "ford@gmail.com", 7);

		List<Car> cars = new ArrayList<Car>();

		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);

//		Stream<Car> stream = Stream.of(c1, c2, c3, c4, c5, c6);

		Stream<Car> streams = cars.stream();
//		stream.map(car -> new Hola(car.getName(), car.getEmail())).forEach(System.out::println);

		Stream<Hola> holas = streams.map(car -> new Hola(car.getName(), car.getEmail()));

		List<Hola> hola2 = holas.collect(Collectors.toList());

		System.out.println(hola2);
	}
}
