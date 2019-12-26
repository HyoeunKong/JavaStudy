package chapter7_test;

class Animal4{
	public static void eat() {
		System.out.println("animal의 정적 메소드 eat");
	}
	
	public void sound() {
		System.out.println("animal의 인스턴스 메소드 sound");
	}
}

class Cat4 extends Animal4{
	
	public static void eat() {
		System.out.println("cat의 정적 메소드 eat");
	}
	public void sound() {
		System.out.println("cat의 인스턴스 메소드 sound");
	}
}
public class AnimalTest1 {

	public static void main(String[] args) {
		Cat4 c = new Cat4();
		
		Animal4 c1 = c;
		c.eat();
		c.sound();
		c1.eat();
		c1.sound();
		

	}

}
