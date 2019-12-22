package org.opentutorials.javatutorials.array;

import java.util.*;
public class Array6 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("¿µÈñ");
		list.add("Ã¶¼ö");
		list.remove(0);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(98);
		int firstNumber = list2.get(0);
		
		System.out.println(firstNumber);
		for(int i =0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}

	}

}
