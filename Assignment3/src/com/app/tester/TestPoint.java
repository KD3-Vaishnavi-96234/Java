package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter x and y for Point 1: ");
		Point2D p1 = new Point2D(sc.nextDouble(), sc.nextDouble());

		System.out.print("Enter x and y for Point 2: ");
		Point2D p2 = new Point2D(sc.nextDouble(), sc.nextDouble());

		System.out.println("Point 1 details: " + p1.getDetails());
		System.out.println("Point 2 details: " + p2.getDetails());
		if (p1.isEqual(p2)) {
			System.out.println("No distance to calculate.");

		} else {
			System.out.println("Distance between points: " + p1.calculateDistance(p2));

		}
		sc.close();

	}

}
