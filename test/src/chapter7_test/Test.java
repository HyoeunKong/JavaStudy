package chapter7_test;

class Base{
	public Base() {
		System.out.println("Base() 积己磊");
	}
}

class Derived extends Base{
	public Derived() {
		System.out.println("Derived() 积己磊");
	}
}


public class Test {

	public static void main(String[] args) {
		Derived d = new Derived();
		// Derived 按眉甫 积己沁绰单 Base 积己磊 鳖瘤 龋免
	}

}
