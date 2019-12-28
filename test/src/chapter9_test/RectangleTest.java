package chapter9_test;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(100,30);
		int r1Area = r1.getArea();
		Rectangle r2 = new Rectangle(200,10);
		int r2Area = r2.getArea();
		int result = r1.compareTo(r2);
		
		if(result == 1) {
			System.out.println(r1+"r1 의 넓이는 "+r1Area+"이므로 더크다");
		}
		else if(result == -1) {
			System.out.println(r2+"r2 의 넓이는" +r2Area+"이므로 더크다");
		}
		else {
			System.out.println("r1과 r2의 넓이가 같다.");
		}
		
	}

}
