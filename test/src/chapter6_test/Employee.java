package chapter6_test;

public class Employee {
	private String name;
	private double salary;
	static int count;
	
	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
		count ++;
	}
	
	protected void finalize() {
		count --;
	}
	
	static int getCount() {
		
		return count;
	}
}
