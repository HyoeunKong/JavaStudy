package org.opentutorials.javatutorials.array;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
	int [] numbers = {1,2,3,4};
	int [] numbers_copy = Arrays.copyOf(numbers, 3 * numbers.length);
	
	for(int e:numbers_copy) {
		System.out.print(e);
	}
	
	}

}
