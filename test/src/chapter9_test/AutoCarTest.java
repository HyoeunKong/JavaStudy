package chapter9_test;

class AutoCar implements OperateCar{
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}
	public void stop() {
		System.out.println("자동차가 정지 합니다.");
	}
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를 " +speed+ "km/h로 바꿉니다.");
	}
	public void turn(int degree) {
		System.out.println("자동차가 방향을 " +degree+ " 도 만큼 바꿉니다.");
	}
}

public class AutoCarTest {

	public static void main(String[] args) {
		AutoCar c = new AutoCar();
		c.start();
		c.stop();
		c.setSpeed(30);
		c.turn(10);
	}

}
