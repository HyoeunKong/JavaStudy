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
		System.out.print("원하시는 좌석 번호를 입력하세요(종료는 -1):");
		int seatNum = scan.nextInt();
		
		if(seatNum>0) {
			if(seats[seatNum] != 1) {
			seats[seatNum] = 1;
			System.out.println("자리가 예약 되었습니다.");
			}
			else {
				System.out.println("이미 예약된 자리 입니다.");
			}
		}
		else {
			break;
		}
	}
	}
}
