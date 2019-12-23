package chapter6_test;

import java.util.*;



public class GameCharacter {
	private class GameItem{
		String name;
		int type;
		int price;
		
		int getPrice(){
			return price;
		}

		@Override
		public String toString() {
			return "GameItem [name=" + name + ", type=" + type + ", price=" + price + "]";
		}
	}
	private ArrayList<GameItem> list = new ArrayList<>();
	
	public void add(String name, int type, int price) {
		GameItem item = new GameItem();
		item.name = name;
		item.type = type;
		item.price = price;
		list.add(item);
	}
	public void print() {
		int total = 0;
		for(GameItem e: list) {
			System.out.println(e);
			total += e.price;
		}
		System.out.println(total);
		
		
	}
}
