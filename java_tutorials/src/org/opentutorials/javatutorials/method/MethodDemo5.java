package org.opentutorials.javatutorials.method;

public class MethodDemo5 {

	public static void numbering(int a, int b) {
		for(int i = a; i < b; i ++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		numbering(3,5);
	}

}
