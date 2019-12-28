package chapter9_test;
interface Drivable{
	void drive();
}
interface Flyable{
	void fly();
}

public class FlyingCar1 implements Drivable,Flyable{
	public void drive() {
		System.out.println("도로를 달리고있다.");
	}
	public void fly() {
		System.out.println("하늘을 날고 있다.");
	}
	
	public static void main(String[] args) {
		FlyingCar1 c = new FlyingCar1();
		c.drive();
		c.fly();

	}

}
