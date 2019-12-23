package chapter6_test;

public class TimeTest {

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(15,22,22);
		Time time3 = new Time(99,99,99);
		
		System.out.println(time1.toString());
		System.out.println(time2.toString());
		System.out.println(time3.toString());

	}

}
