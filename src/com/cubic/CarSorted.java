package com.cubic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bike {
	private String color;
	private int cc;
	private int price;

	public Bike(String color, int cc, int price) {
		super();
		this.color = color;
		this.cc = cc;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public int getCc() {
		return cc;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Bike [color=" + color + ", cc=" + cc + ", price=" + price + "]";
	}

}

public class CarSorted {
	public static void main(String[] args) {
		List<Bike> bikes = new ArrayList<Bike>();

		Bike bike1 = new Bike("white", 120, 233);
		Bike bike2 = new Bike("blue", 34, 232);
		Bike bike3 = new Bike("green", 444, 566);
		Bike bike4 = new Bike("yellow", 233, 233);
		Bike bike5 = new Bike("brown", 222, 233);

		bikes.add(bike1);
		bikes.add(bike2);
		bikes.add(bike3);
		bikes.add(bike4);
		bikes.add(bike5);

		List<Bike> bikeList = bikes.stream().sorted((t1, t2) -> {
			int pp = t1.getPrice() - t2.getPrice();
			if (pp == 0) {
				pp = t2.getColor().compareTo(t1.getColor());
			}
			return pp;
		}).collect(Collectors.toList());
		bikes.forEach(System.out::println);
		System.out.println("After sorting");
		bikeList.forEach(System.out::println);

	}
}
