package org.opentutorials.javatutorials.array;
import java.util.*;
public class SortExample {

	public static void main(String[] args) {
		int [] rand = new int[10];
		for(int i = 0; i < rand.length; i++ ) {
			rand[i] = (int) (Math.random() * 100);
		}
		System.out.print("최초의 리스트: ");
		for(int e:rand) {
			System.out.print(e+" ");
		}
		
		Arrays.sort(rand);
		
		System.out.print("\n정렬된리스트: ");
		for(int e:rand) {
			System.out.print(e +" ");
		}
	}

}
