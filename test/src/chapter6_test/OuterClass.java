package chapter6_test;

class OuterClass1 {
	private int value = 10;
	
	class InnerClass{
		public void myMethod() {
			System.out.println("�ܺ� Ŭ������ private ���� ��: " + value);
		}
	}
	
	OuterClass1(){
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}
	
}

public class OuterClass{
	public static void main(String[] args) {
		OuterClass1 outer = new OuterClass1();
	}
}
