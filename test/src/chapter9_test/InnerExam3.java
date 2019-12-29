package chapter9_test;

public class InnerExam3 {
	public void plus() {
		class Cal{
			int value = 0;
			public void value() {
				value ++;
			}
			}
		Cal cal1 = new Cal();
		cal1.value();
		System.out.println(cal1.value);
	}
	public static void main(String[] args) {
		InnerExam3 e = new InnerExam3();
		e.plus();

	}

}
