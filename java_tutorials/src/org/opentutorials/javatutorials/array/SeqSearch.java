package org.opentutorials.javatutorials.array;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int [] s = {0,1,2,3,4,5,6,7,8,9,10};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է��ϼ���: ");
			int value = scan.nextInt();
	
			
		int index = -1;
		
		
		for(int i = 0; i < s.length ; i++) {
			
			if(s[i] == value) {
				index = i;
			}
		}
		
		if(index > 0 && index < s.length) {
		System.out.print("ã���ô�"+value+ " ����"+index+"�� ��ġ�� �ֽ��ϴ�.\n");
		}
		else {
			System.out.println("ã���ô� ���� �����ϴ�.\n");
		}
}
}
}
