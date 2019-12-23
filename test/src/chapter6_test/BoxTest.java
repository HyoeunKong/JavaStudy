package chapter6_test;

public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box(10,20,30);
		Box b2 = new Box(20,30,40);
		
		Box winner = b1.WhosLargest(b1, b2);
		
		System.out.println(winner.height + "," +  winner.length +","+ winner.width + "," + winner.volume);
		
		System.out.println(winner+","+b1+","+b2);
	}

}
