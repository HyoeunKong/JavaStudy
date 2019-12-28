package chapter9_test;

interface MyInterface{
	public void myMethod1();
	
	default void myMethod2() {
		System.out.println("myMethode2()");
	}
}

public class DefaultMethodTest implements MyInterface{
	public void myMethod1() {
		System.out.println("myMethode1()");
	}
	public static void main(String[] args) {
		DefaultMethodTest d = new DefaultMethodTest();
		d.myMethod1();
		d.myMethod2();

	}

}
