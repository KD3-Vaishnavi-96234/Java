package day2;

import java.util.Scanner;

public class Assignment_q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0;

		System.out.print("Enter two numbers: ");
		if (!sc.hasNextInt() && sc.hasNextDouble()) {
			a = sc.nextDouble();
			
		} else {
			System.err.println("Invalid input for first number");
			System.exit(0);
		}

		if (!sc.hasNextInt() && sc.hasNextDouble()) {
			b = sc.nextDouble();
		} else {
			System.err.println("Invalid input for second number");
			System.exit(0);
		}

		double average = (a + b) / 2.0;
		System.out.println("Average: " + average);

		sc.close();
	}
}
