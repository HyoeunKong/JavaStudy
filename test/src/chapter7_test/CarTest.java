package chapter7_test;

class Car1{
	
}

public class CarTest {

	public static void main(String[] args) {
		Car1 obj = new Car1();
		System.out.println("obj is of type " + obj.getClass().getName());
		String s1 = new String("abcdef");
		String s2 = new String("abcdef");
	
		if(s1 == s2) {
			System.out.println("스트링 객체가 저장되어있는 주소값이 같다 이건 말도안되는문장");
		}
		else {
			System.out.println("당연한 결과");
		}

		if(s1.equals(s2)) {
			System.out.println("이거 출력됨");
		}
		
		if(s1 instanceof String) {
			System.out.println("이거출력됨1");
		}
	}

}
