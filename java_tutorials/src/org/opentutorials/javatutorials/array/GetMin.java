package org.opentutorials.javatutorials.array;

public class GetMin {

	public static void main(String[] args) {
		int[] s = {12,3,19,6,18,8,12,4,1,19};
		
		int minimum;
		minimum = s[0];
		
		for(int i = 1; i < s.length; i++) {
			if(s[i] < minimum) {
				minimum = s[i];
			}
		}
		
		System.out.println("가장 작은 수는 " + minimum + "입니다.");
	
	
	}

}
