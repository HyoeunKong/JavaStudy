package chapter7_test;

public class Rectangle extends Shape {
	private int width, height;

	
	double area() {
		return (double)width * height;
	}
	
	void draw() {
		System.out.println("(" + this.getX()+ ") ��ġ��  ����:" + width+"����:"+height);
	}
}	
