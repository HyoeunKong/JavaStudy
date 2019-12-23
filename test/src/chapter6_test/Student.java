package chapter6_test;

public class Student {
	private int number;
	private String name;
	private int age;
	
	Student(){
		number = 1;
		name = "°øÈ¿Àº";
		age = 26;
	}
	
	Student(int x, String y, int z){
		this.number = x;
		this.name = y;
		this.age = z;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age=" + age + "]";
	}

	
}
