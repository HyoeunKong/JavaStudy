package org.opentutorials.javatutorials.array;
import java.util.Scanner;
public class TheaterReserve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] seats = {0,0,0,0,0,0,0,0,0,0};
		while(true) {
		System.out.println("--------------------------");
		for(int i = 0; i < seats.length; i++) {
		System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("--------------------------");
		for(int i = 0; i < seats.length; i++) {
			System.out.print(seats[i] + " ");
		}
		System.out.println("");
		System.out.print("���Ͻô� �¼� ��ȣ�� �Է��ϼ���(����� -1):");
		int seatNum = scan.nextInt();
		
		if(seatNum>0) {
			if(seats[seatNum] != 1) {
			seats[seatNum] = 1;
			System.out.println("�ڸ��� ���� �Ǿ����ϴ�.");
			}
			else {
				System.out.println("�̹� ����� �ڸ� �Դϴ�.");
			}
		}
		else {
			break;
		}
	}
	}
}
