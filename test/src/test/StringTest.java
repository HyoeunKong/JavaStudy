package test;

public class StringTest {

	public static void main(String[] args) {
		String s = new String("I love you");
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.compareTo("I love you"));
		System.out.println(s.concat(" too"));
		System.out.println(s.equals("I love you"));
		System.out.println(s.equalsIgnoreCase("i love you"));
		System.out.println(s.replace("you", "him"));
		System.out.println(s.substring(2,6));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("-----------------------------");
		
		String proverb = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println("문자열의 길이"+ proverb.length());
		
		s1 = proverb.concat(" never Bites!"); 
		s2 = proverb.replace('b','B');
		s3 = proverb.substring(2,5);
		s4 = proverb.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
	}
	

}
