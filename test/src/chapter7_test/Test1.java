package chapter7_test;

class Shape1{
	private int x,y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Shape1(int x, int y) {
		System.out.println("shape 持失切");
		this.x = x;
		this.y = y;
	}
}
class Rectangle1 extends Shape1{
	private int width, height;
	public Rectangle1(int x, int y, int width, int height) {
		super(x,y);
		System.out.println("rectangle 持失切");
		this.width = width;
		this.height = height;
	}
}

class ColoredRectangle extends Rectangle1{
	private String color;
	public ColoredRectangle(int x, int y, int width, int height, String color) {
		super( x, y, width, height);
		System.out.println("coloredrectangle 持失切");
		this.color = color;
		//System.out.println(color);
	}
}


public class Test1 {

	public static void main(String[] args) {
		ColoredRectangle r = new ColoredRectangle(1,2,10,20,"blue");	
		int x = r.getX();
		int y = r.getY();

		System.out.println(x+" " +y);
	}

}
