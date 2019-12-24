package chapter7_test;

public class SportsCarTest {

	public static void main(String[] args) {
		SportsCar car1 = new SportsCar();
		car1.speed = 10;
		System.out.println(car1.speed);
		car1.setSpeed(60);
		System.out.println(car1.speed);
		car1.setTurbo(true);
	
	}

	
}
