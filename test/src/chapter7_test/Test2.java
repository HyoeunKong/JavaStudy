package chapter7_test;

abstract class Shape2{ //추상 클래스 Shape 를 선언한다. 추상클래스로는 객체를 생성할 수 없다.
	private int x, y;
	
	public void move(int x, int y) {//추상 클래스라고 하더라도 추상메소드가 아닌 보통의 메소드도 가질 수 있음을 유의 
		this.x = x;
		this.y = y;
	}
	public abstract void draw(); // 추상메소드를 하나라도 가지면 추상클래스가 된다. 추상 메소드를 가지고 있는데도 abstract를 class 앺에 붙이지 않으면 컴파일 오류 발생
	
}

class Rectangle2 extends Shape2{
	private int width, height;
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
}

class Circle extends Shape2{
	private int radius = 1;
	public void draw() {
		System.out.println("원 그리기 메소드"+radius);
	}
}

public class Test2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		Rectangle2 r = new Rectangle2();
		r.draw();

	}

}
