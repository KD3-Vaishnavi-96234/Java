package com.drivingcost;

import java.util.Scanner;

public class Test {
	
	public double calculateCost(DrivingCost dc) {
		double fuelCost = (dc.totalMiles / dc.avgMiles) * dc.costOfGasoline;
		double totalCost = fuelCost + dc.parkingFees + dc.toll;
		return totalCost;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Total miles driven per day: ");
		double miles = sc.nextDouble();
		System.out.println("Cost per gallon of gasoline: ");
		double cost = sc.nextDouble();
		System.out.println("Average miles per gallon: ");
		double avgMiles = sc.nextDouble();
		System.out.println("Parking fees per day: ");
		double fee = sc.nextDouble();
		System.out.println("Tolls per day: ");
		double toll = sc.nextDouble();

		DrivingCost dc = new DrivingCost(miles, cost, avgMiles, fee, toll);
		Test t = new Test();
		double Totalcost = t.calculateCost(dc);
		System.out.println("your daily driving cost: " + Totalcost);

		sc.close();
	}

}
