package chapter7_test;

public class Dog extends Animal1 {
	
	void eat() {
		System.out.println("강아지가 먹고 있습니다.");
	}

	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();

	}

}
