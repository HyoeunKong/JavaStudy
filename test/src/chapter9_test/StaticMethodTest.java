package chapter9_test;

interface MyInterface3{
	static void print(String msg) {
		System.out.println(msg + ":인터페이스의 정적 메소드 호출");
	}
}

public class StaticMethodTest implements MyInterface3 {

	public static void main(String[] args) {
		MyInterface3.print("하하");
	}

}
