package day2;

import java.util.Scanner;

public class Assignment_q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		int qty;
		double totalBill = 0;
		do {
			System.out.println("Food Menu:");
			System.out.println("1. Dosa - 100");
			System.out.println("2. Samosa - 50");
			System.out.println("3. Idli - 60");
			System.out.println("4. Generate Bill");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter quantity of Dosa: ");
				qty = sc.nextInt();
				totalBill += qty * 100;
				break;
			case 2:
				System.out.print("Enter quantity of Samosa: ");
				qty = sc.nextInt();
				totalBill += qty * 50;
				break;
			case 3:
				System.out.print("Enter quantity of Idli: ");
				qty = sc.nextInt();
				totalBill += qty * 60;
				break;
			case 4:
				System.out.println("Total Bill: " + totalBill);
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
			
		} while (choice != 0);

		sc.close();

	}
}
