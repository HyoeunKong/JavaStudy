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
			throw new RuntimeException("�̸��� �ݵ�� �Է��ؾ���");
		}
		this.name = name;
		System.out.println(this.name);
	}
}
public class StaticMethodTest2 {

	

	public static void main(String[] args) {
		Employee e = new Employee("ȿ��");
		

	}

}
