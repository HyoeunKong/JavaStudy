package chapter6_test;

public class SafeArrayTest {

	public static void main(String[] args) {
		SafeArray obj = new SafeArray(3);

		
		for(int i = 0; i < (obj.length) + 1 ; i++) {
			obj.put(i, i*10);
		}
		
		for(int i = 0; i < obj.length; i ++) {
			System.out.print(obj.get(i));
		}
	}

}
