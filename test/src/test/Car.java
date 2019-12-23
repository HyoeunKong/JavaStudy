package test;

public class Car {
	String color;
	int gear;
	int speed;
	
	
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", gear=" + gear + ", speed=" + speed + "]";
	}
	
	void changeGear(int x){
		gear = x;
	}
	void speedUp(int x) {
		speed = speed + x;
	}
	void speedDown(int x) {
		speed = speed - x;
	}
}
