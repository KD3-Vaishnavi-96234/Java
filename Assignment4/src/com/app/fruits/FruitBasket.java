package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of basket");
		int n = sc.nextInt();

		int index = 0;
		Fruit[] basket = new Fruit[n];
		while (true) {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket");
			System.out.println("5. Display name, color, weight, taste of all fresh fruits in the basket");
			System.out.println("6. Display tastes of all stale fruits in the basket");
			System.out.println("7. Mark a fruit as stale (input: index)");
			System.out.println("8. Mark all sour fruits stale");

			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Exiting...");
				sc.close();
				return;
			case 1:
				if (index < n) {
					System.out.println("Enter name, weight, color for Mango:");
					String name = sc.next();
					double weight = sc.nextDouble();
					String color = sc.next();
					basket[index++] = new Mango(name, weight, color);
				} else {
					System.out.println("Basket is full!");
				}
				break;
			case 2:
				if (index < n) {
					System.out.println("Enter name, weight, color for Orange:");
					String name = sc.next();
					double weight = sc.nextDouble();
					String color = sc.next();
					basket[index++] = new Orange(name, weight, color);
				} else {
					System.out.println("Basket is full!");
				}
				break;
			case 3:
				if (index < n) {
					System.out.println("Enter name, weight, color for Apple:");
					String name = sc.next();
					double weight = sc.nextDouble();
					String color = sc.next();
					basket[index++] = new Apple(name, weight, color);
				} else {
					System.out.println("Basket is full!");
				}
				break;
			case 4:
				for (Fruit fruit : basket) {
					if (fruit != null)
						System.out.println(fruit.getName());
				}
				break;
			case 5:
				for (Fruit fruit : basket) {
					if (fruit != null && fruit.isFresh()) {
						System.out.println(fruit.toString() + ", Taste: " + fruit.taste());
					}
				}
				break;
			case 6:
				for (Fruit fruit : basket) {
					if (fruit != null && !fruit.isFresh()) {
						System.out.println(fruit.getName()+ " :"+fruit.taste());
					}
				}
				break;
			case 7:
				System.out.println("Enter index to mark as stale:");
				int i = sc.nextInt(); 
				if (i >= 0 && i < n) {
					basket[i].setFresh(false);
					System.out.println("Fruit at index " + i + " marked as stale.");
				} else {
					System.out.println("Invalid index!");
				}
				break;
			case 8:
				for (Fruit fruit : basket) {
					if (fruit != null && fruit.taste().equals("sour")) {
						fruit.setFresh(false);
					}
				}
				System.out.println("All sour fruits marked as stale.");
				break;
			default:
				System.out.println("Invalid choice! Please try again.");

			}
			sc.close();
		}
		
	}

}
