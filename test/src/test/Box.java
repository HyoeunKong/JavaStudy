package test;

public class Box {
	private int width;
	private int length;
	private int height;
	private int volume;
	
	Box(int x, int y, int z){
		width = x;
		length = y;
		height = z;
		volume = x * y * z;
	}
	
	public int getVolume() {
		return volume;
	}
}
