package chapter14_test;

public class TryCatch1 {

	public static void main(String[] args) {
		try {
		int result = 10/0;
		}
		catch(Exception e) {
			System.out.println("���� �߻�");
		}
		finally {
			System.out.println("���");
		}
	}

}
