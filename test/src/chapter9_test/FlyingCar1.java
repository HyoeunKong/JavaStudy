package chapter9_test;
interface Drivable{
	void drive();
}
interface Flyable{
	void fly();
}

public class FlyingCar1 implements Drivable,Flyable{
	public void drive() {
		System.out.println("���θ� �޸����ִ�.");
	}
	public void fly() {
		System.out.println("�ϴ��� ���� �ִ�.");
	}
	
	public static void main(String[] args) {
		FlyingCar1 c = new FlyingCar1();
		c.drive();
		c.fly();

	}

}
