package chapter7_test;

abstract class Shape2{ //�߻� Ŭ���� Shape �� �����Ѵ�. �߻�Ŭ�����δ� ��ü�� ������ �� ����.
	private int x, y;
	
	public void move(int x, int y) {//�߻� Ŭ������� �ϴ��� �߻�޼ҵ尡 �ƴ� ������ �޼ҵ嵵 ���� �� ������ ���� 
		this.x = x;
		this.y = y;
	}
	public abstract void draw(); // �߻�޼ҵ带 �ϳ��� ������ �߻�Ŭ������ �ȴ�. �߻� �޼ҵ带 ������ �ִµ��� abstract�� class �� ������ ������ ������ ���� �߻�
	
}

class Rectangle2 extends Shape2{
	private int width, height;
	public void draw() {
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}
}

class Circle extends Shape2{
	private int radius = 1;
	public void draw() {
		System.out.println("�� �׸��� �޼ҵ�"+radius);
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
