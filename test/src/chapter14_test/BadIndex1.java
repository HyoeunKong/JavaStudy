package chapter14_test;

public class BadIndex1 {

	public static void main(String[] args) {
		int[] array = new int[10];
		for(int i = 0; i < array.length; i ++) {
			array[i] = i;
		}
		int result = array[12];
		System.out.println("이문장이 실행될까요?");

	}

}
