package org.opentutorials.javatutorials.io;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Scanner3Demo {

	public static void main(String[] args) {
		try {
			File file = new File("out.txt"); //입력이라는 것이 꼭 사용자가 입력하는것이 아님 파일에 저장되어 있는 데이터도 입력값
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 1000);
			}
			sc.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
