package chapter9_test;

public class Rectangle implements Comparable {
	private int width = 0;
	private int height = 0;
	
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
	public Rectangle (int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println(this);
	}
	
	public int getArea() {
		return this.width * this.height;
	}
	
	public int compareTo(Object other) {
		Rectangle otherRect = (Rectangle) other;
		if(this.getArea() < otherRect.getArea())
			return -1;
		else if (this.getArea() > otherRect.getArea())
			return 1;
		else
			return 0;
	}
	
}
