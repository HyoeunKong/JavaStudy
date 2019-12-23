package chapter6_test;

public class Car {
	private String model;
	private String color;
	private int speed;
	private int id;
	static int number = 0;
	
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
		this.id = ++number;
	}
	
	static int carNum() {
		return number;
	}
}
