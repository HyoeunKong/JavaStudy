package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {
	public static String[] getMembers (){
		String [] names = {"a","b","c"};
		return names;
	}

	public static void main(String[] args) {
	String[] members = getMembers();
	for(String e : members) {
		System.out.println(e);
	}
	}

}
