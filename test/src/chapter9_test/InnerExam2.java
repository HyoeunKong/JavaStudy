package chapter9_test;

public class InnerExam2 {

	static class Cal{
		int value = 0;
		public void plus() {
			value ++;
		}
	}
	public static void main(String[] args) {
		InnerExam2.Cal c = new InnerExam2.Cal();
		c.plus();
		System.out.println(c.value);
	}

}
