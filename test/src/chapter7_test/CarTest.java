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
			System.out.println("��Ʈ�� ��ü�� ����Ǿ��ִ� �ּҰ��� ���� �̰� �����ȵǴ¹���");
		}
		else {
			System.out.println("�翬�� ���");
		}

		if(s1.equals(s2)) {
			System.out.println("�̰� ��µ�");
		}
		
		if(s1 instanceof String) {
			System.out.println("�̰���µ�1");
		}
	}

}
