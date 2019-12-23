package chapter6_test;

public class Box {
	int width, length, height, volume;
	
	Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
		volume = w * l * h;
	}
	
	Box WhosLargest(Box box1, Box box2) {
		if(box1.volume > box2.volume) {
			System.out.println("winner is" + box1);
			return box1;
		}
		else {
			System.out.println("winner is" + box2);
			return box2;
		}
	}
}
