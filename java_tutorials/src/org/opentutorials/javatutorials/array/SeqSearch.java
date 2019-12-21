package org.opentutorials.javatutorials.array;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int [] s = {0,1,2,3,4,5,6,7,8,9,10};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("값을 입력하세요: ");
			int value = scan.nextInt();
	
			
		int index = -1;
		
		
		for(int i = 0; i < s.length ; i++) {
			
			if(s[i] == value) {
				index = i;
			}
		}
		
		if(index > 0 && index < s.length) {
		System.out.print("찾으시는"+value+ " 값은"+index+"에 위치해 있습니다.\n");
		}
		else {
			System.out.println("찾으시는 값이 없습니다.\n");
		}
}
}
}
