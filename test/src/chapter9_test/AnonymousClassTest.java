package chapter9_test;

interface RemoteControl3{
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		RemoteControl3 c = new RemoteControl3() {
			public void turnOn() {
				System.out.println("on");
			}
			public void turnOff() {
				System.out.println("off");
			}
		};
		
		c.turnOff();
		c.turnOn();
		
	}

}
