package chapter6_test;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		obj.setAge(-1);
		System.out.println("�̸���" + obj.getName() +" ���� �ܰ�� " + obj.getBalance()+ "�Դϴ�.");
		
	}

}
