package org.opentutorials.javatutorials.numberstring;

public class LengthDemo {

	public static void main(String[] args) {
		//String[] classGroup = {"ÃÖÁøÇõ","ÃÖÀ¯ºó","ÇÑÀÌ¶÷","ÀÌ°íÀ×"};
		String[] classGroup = new String[4];
		classGroup[0] = "ÃÖÁøÇõ";
		System.out.println(classGroup.length);
		classGroup[1] = "ÃÖÀ¯ºó";
		System.out.println(classGroup.length);
		classGroup[2] = "ÇÑÀÌ¶÷";
		System.out.println(classGroup.length);
		classGroup[3] = "ÀÌ°íÀ×";
		System.out.println(classGroup.length);
				
		System.out.println(classGroup[0]);
	}

}
