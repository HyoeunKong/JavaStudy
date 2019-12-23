package test;

import java.util.Arrays;

public class LongString {

	public static void main(String[] args) {
		String[] animal = {"dog","cat","rabbit","elepants"};
	
		
		for(int i = 1; i < animal.length; i++) {
			if(animal[0].length() < animal[i].length()) {
				animal[0] = animal[i];
			}
		}
		
		System.out.println("가장 길이가 긴 문장은: "+animal[0]+"\n"+
							"문장의 길이는: "+animal[0].length());
}

}
