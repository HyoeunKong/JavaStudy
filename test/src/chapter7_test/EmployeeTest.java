package chapter7_test;

class Date{
	private int year;
	private int month;
	private int date;
	
	public Date(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", date=" + date + "]";
	}
}

class Employee1{
	private String name;
	private Date birthDate; //has-a 관계 구현
	
	public Employee1(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
}

public class EmployeeTest {

	public static void main(String[] args) {
	
	Date birth = new Date(1990,1,1);
	Employee1 employee = new Employee1("홍길동", birth);
	System.out.println(employee);
	}

}
