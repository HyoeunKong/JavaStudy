package chapter9_test;

interface MyInterface3{
	static void print(String msg) {
		System.out.println(msg + ":�������̽��� ���� �޼ҵ� ȣ��");
	}
}

public class StaticMethodTest implements MyInterface3 {

	public static void main(String[] args) {
		MyInterface3.print("����");
	}

}
