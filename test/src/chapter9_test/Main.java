package chapter9_test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split("\\.");
		int[] arrInt = new int[3];
		for(int i = 0; i < arr.length; i++) {
			arrInt[i] = Integer.parseInt(arr[i]);
		}
		
		String year = String.format("%04d", arrInt[0]); 
		String month = String.format("%02d", arrInt[1]); 
		String day = String.format("%02d", arrInt[2]); 
		System.out.println(year+"."+month+"."+day);
		}
	
		
		
	}


