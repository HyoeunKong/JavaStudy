package org.opentutorials.javatutorials.array;

public class PizzaTopping {

	public static void main(String[] args) {
		String[] toppings = {"Pepperoni","Mushrooms","Onions","Sausage","Bacon"};
		for(String e : toppings) {
			System.out.print(e + " ");
		}
		
		System.out.println("\n");
		for(int i = 0; i < toppings.length; i++) {
			System.out.print(toppings[i] + " ");
		}
		
	}

}
