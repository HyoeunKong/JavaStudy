package org.opentutorials.javatutorials.array;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		final int STUDENTS = 5;
		double total = 0;
		Scanner scan = new Scanner(System.in);
		
		int [] scores = new int[STUDENTS];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print("������ �Է��Ͻÿ�:");
			scores[i] = scan.nextInt();
		}
		
		for(int i = 0; i< scores.length; i++) {
			total += scores[i];
		}
		
		System.out.println("��հ���"+total/STUDENTS+"�Դϴ�");
	}

}
