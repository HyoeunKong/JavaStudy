package chapter9_test;


class Television1 implements RemoteControl{
	boolean onOff = false;
	public void turnon() {
		onOff = true;
	}
	public void turnoff() {
		onOff = false;
	}
}

public class Television {

	public static void main(String[] args) {
		RemoteControl tv = new Television1();
		tv.turnoff();
		tv.turnon();
		
	}

}
