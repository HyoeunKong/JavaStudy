package chapter6_test;

public class Account {
	private int regNumber;
	private String name;
	private int balance;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		else {
		this.age = age;
		}
	}
	public int getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
	
