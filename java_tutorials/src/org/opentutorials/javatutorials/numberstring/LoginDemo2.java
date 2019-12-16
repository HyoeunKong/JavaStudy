package org.opentutorials.javatutorials.numberstring;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		
		if(id.equals("egoing")) {
			if(pw.equals("1111")){
				System.out.println("right");
			}
			else {
				System.out.println("false");
			}
			
		}else {
				System.out.println("false");
			}
		
		
		if(id.equals("egoing") && pw.equals("1111")) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
		
	}

}
