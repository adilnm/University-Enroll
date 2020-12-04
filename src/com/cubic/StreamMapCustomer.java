package com.cubic;

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

public class StreamMapCustomer {
	public static void main(String[] args) {

		Car c1 = new Car("Audi", "audi@gmail.com", 23);
		Car c2 = new Car("BMW", "bmw@gmail.com", 12);
		Car c3 = new Car("Maruti", "Maruti@gmail.com", 33);
		Car c4 = new Car("Toyota", "toyota@gmail.com", 3);
		Car c5 = new Car("Nissan", "nissan@gmail.com", 4);
		Car c6 = new Car("Ford", "ford@gmail.com", 7);

		Stream<Car> stream = Stream.of(c1, c2, c3, c4, c5, c6);

		stream.map(car -> car.getAge()).forEach(System.out::println);

	}
}
