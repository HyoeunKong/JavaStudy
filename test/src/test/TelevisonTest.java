package test;

public class TelevisonTest {

	public static void main(String[] args) {
		Television myTv = new Television(7,9,true);
	
		Television yourTv = new Television(9,12,true);
	
		myTv.print();
		yourTv.print();
		
		int myTvChannel = myTv.getChannel();
		int yourTvChannel = yourTv.getChannel();
		
		System.out.println("myTv의 채널은 "+ myTvChannel);
		System.out.println("yourTv의 채널은 "+yourTvChannel );
		
		myTv.setChannel(1);
		int myTvChannel1 = myTv.getChannel();
		System.out.println("현재 채널은" + myTvChannel1+ "입니다.");
		
		
	}

	

}
