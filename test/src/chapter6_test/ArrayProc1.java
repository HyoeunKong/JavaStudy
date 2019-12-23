package chapter6_test;
import java.util.*;
public class ArrayProc1 {


	void getValue(int[] array) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < array.length; i++) {
			System.out.println("성적을 입력하세요: ");
			array[i] = scan.nextInt();
		}
	}
	double getAverage(int[] array) {
		double result = 0;
	
		for(int i = 0; i< array.length; i++) {
			result += array[i];
		}
		return result/array.length;
	}

}
