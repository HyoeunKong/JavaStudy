package test;

import java.util.*;

public class WwwCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		while(true) {
			System.out.print("문자열을 입력하세요: ");
			str = scan.next();
			if(str.matches("^www\\.(.+)")){
				System.out.println(str + "은 www로 시작합니다.");
			}
			
			else if(str.equals("quit")) {
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				System.out.println(str+"은 www로 시작하지 않습니다.");
			}
			
		}
	}

}
