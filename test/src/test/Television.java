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
		System.out.println("���� �ڷ������� ä����" +channel +"�̰� ������" +volume+"�Դϴ�.");
	}

	int getChannel(){
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
}
