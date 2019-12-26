package chapter7_test;

class Shape3 {
	protected int x, y;
	public void draw() {
		System.out.println("shape draw");
	}
}

class Rectangle3 extends Shape3{
	private int width, height;
	
	public void draw() {
		System.out.println("rectangle draw");
	}
}

class Triangle3 extends Shape3 {
	private int base,height;
	public void draw() {
		System.out.println("triangle draw");
	}
}

class Circle3 extends Shape3{
	private int radius;
	
	public void draw() {
		System.out.println("circle draw");
	}
}



public class ShapeTest {

	private static Shape3[] arrayOfShapes;
	public static void main(String[] args) {
		init();
		drawAll();

	}
	
	public static void init() {
		arrayOfShapes = new Shape3[3];
		arrayOfShapes[0] = new Rectangle3();
		arrayOfShapes[1] = new Triangle3();
		arrayOfShapes[2] = new Circle3();
		
	}
	
	public static void drawAll() {
		for(int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}
	}

}
