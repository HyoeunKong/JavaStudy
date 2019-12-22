package org.opentutorials.javatutorials.array;


public class Array5 {

	public static void main(String[] args) {
		int [][] s = {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120}
		};
		
		for(int i = 0; i < s.length; i ++) {
			for(int j = 0; j < s[i].length; j++ ) {
				System.out.println(i+"За"+j+"ї­"+s[i][j]);
			}
		}
	}

}
