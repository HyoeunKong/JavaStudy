package chapter6_test;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("s600","white",80);
		Car c2 = new Car("e500","blue",20);
		int n = Car.carNum();
		System.out.println("���ݱ��� ����� ������ �� " + n);

	}

}
