package chapter6_test;
import java.util.*;
public class AccountProcTest1 {

	public static void main(String[] args) {
		int STUDENTS = 5;
		ArrayProc1 obj = new ArrayProc1();
		int [] score  =  new int [STUDENTS];
		obj.getValue(score);
		double average = obj.getAverage(score);
		System.out.println("평균 성적은 " + average);
	}

}
