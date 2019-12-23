package test;

public class BoxTest {

	public static void main(String[] args) {
		Box box1 = new Box(20,30,40);
		int volume = box1.getVolume();
		System.out.println("상자의 부피는 " + volume +" 입니다.");
	}

}
