package org.opentutorials.javatutorials.numberstring;

public class LoginDemo3 {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		
		if((id.equals("egoing")||id.equals("he0077")||id.equals("he0094"))&&pw.equals("1111")) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
	}

}
