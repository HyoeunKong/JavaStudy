package chapter9_test;

interface MyInterface2{
	void sayHello(int x , int y);
}

public class LambdaTest1 {

	public static void main(String[] args) {
		MyInterface2 h = (int x, int y) -> {
			int result = x + y;
			System.out.println("�� ������ ���� " + result);
		};
		h.sayHello(3,4);
	}

}
