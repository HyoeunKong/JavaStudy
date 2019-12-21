package org.opentutorials.javatutorials.array;

public class RollDice {

	public static void main(String[] args) {
		final int SIZE = 6;
		int[] freq = new int[SIZE];
		
		for(int i = 0; i < 5; i++) {
		double rand = Math.random();
		System.out.println( rand * SIZE);
		System.out.println((int)(rand * SIZE));
		++ freq[(int) (rand * SIZE)];
		}
		System.out.println("===============");
		System.out.println("¸é  ºóµµ");
		System.out.println("===============");
		for(int i = 0; i < SIZE; i ++) {
			System.out.println((i+1)+" "+ freq[i]);
		}
	}

}
