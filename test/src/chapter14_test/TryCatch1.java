package chapter14_test;

public class TryCatch1 {

	public static void main(String[] args) {
		try {
		int result = 10/0;
		}
		catch(Exception e) {
			System.out.println("오류 발생");
		}
		finally {
			System.out.println("통과");
		}
	}

}
