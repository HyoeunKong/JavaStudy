package chapter7_test;

class Base{
	public Base() {
		System.out.println("Base() ������");
	}
}

class Derived extends Base{
	public Derived() {
		System.out.println("Derived() ������");
	}
}


public class Test {

	public static void main(String[] args) {
		Derived d = new Derived();
		// Derived ��ü�� �����ߴµ� Base ������ ���� ȣ��
	}

}
