package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	public static String numbering(int a, int b) {
		String output = "";
		for(int i = a; i < b ; i ++) {
			output += i ;
		}
		return output;
	}
	public static void main(String[] args) {
		String result = numbering(1,10);
		System.out.println(result);
	}

}
