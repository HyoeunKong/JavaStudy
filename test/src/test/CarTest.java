package test;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "red";
		car1.gear = 2;
		car1.speed = 80;
		
		car1.changeGear(5);
		car1.speedUp(10);
		System.out.println(car1);
	}

}
