package test;

import java.util.*;

public class WwwCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		while(true) {
			System.out.print("���ڿ��� �Է��ϼ���: ");
			str = scan.next();
			if(str.matches("^www\\.(.+)")){
				System.out.println(str + "�� www�� �����մϴ�.");
			}
			
			else if(str.equals("quit")) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			else {
				System.out.println(str+"�� www�� �������� �ʽ��ϴ�.");
			}
			
		}
	}

}
