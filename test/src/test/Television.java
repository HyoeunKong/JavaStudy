package test;

public class Television {

	int channel;
	int volume;
	boolean onOff;
	
	Television(int x, int y, boolean z){
		channel = x;
		volume = y;
		onOff = z;
	}
	
	void print() {
		System.out.println("나의 텔레비전의 채널은" +channel +"이고 볼륨은" +volume+"입니다.");
	}

	int getChannel(){
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
}
