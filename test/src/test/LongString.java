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
		
		System.out.println("���� ���̰� �� ������: "+animal[0]+"\n"+
							"������ ���̴�: "+animal[0].length());
}

}
