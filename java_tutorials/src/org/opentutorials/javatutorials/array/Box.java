package org.opentutorials.javatutorials.array;

class BoxTest{
	int width;
	int length;
	int height;
	
	void print() {
		System.out.println("������ ���� ���� ���̴�"+width+","+length+","+height+"�Դϴ�.");

	}
}

public class Box {

	public static void main(String[] args) {
		BoxTest box1 = new BoxTest();
		box1.width = 20;
		box1.length = 20;
		box1.height = 20;
		box1.print();
		
		BoxTest box2 = new BoxTest();
		box2.width = 30;
		box2.length = 30;
		box2.height = 30;
		box2.print();
	}

}
