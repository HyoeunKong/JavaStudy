package chapter9_test;

interface Employable{
	static boolean isEmpty(String name) {
		if(name == null || name.trim().length() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}

class Employee implements Employable{
	private String name;
	
	public Employee(String name) {
		if(Employable.isEmpty(name) == true) {
			throw new RuntimeException("이름은 반드시 입력해야함");
		}
		this.name = name;
		System.out.println(this.name);
	}
}
public class StaticMethodTest2 {

	

	public static void main(String[] args) {
		Employee e = new Employee("효은");
		

	}

}
