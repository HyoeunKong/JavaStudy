package chapter6_test;

class Test3{
	static int x;
	int y;
	
	static {
		x = 10;
		System.out.println("정적 변수가 호출되었슴");
	}
	
}

public class Test2{

	public static void main(String args[]) {	
		System.out.println(Test3.x);
		
	}

	



}