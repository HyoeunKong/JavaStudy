package chapter9_test;

interface Drivable1{
	int SPEED = 20;
	void drive();
}
class Flyable1{
	int speed;
	
	void setSpeed(int speed) {
		this.speed = speed;
		System.out.println(speed+" �� �ӵ��� �ϴ��� ���� �ڵ���");
	}
}

public class FlyingCar2 extends Flyable1 implements Drivable1{
	
	public void drive() {
		System.out.println("���θ� �޸��� �ڵ���");
	}
	
	public static void main(String[] args) {
	FlyingCar2 c = new FlyingCar2();
	c.drive();
	c.setSpeed(10);

	System.out.println(SPEED + 30);

}
}