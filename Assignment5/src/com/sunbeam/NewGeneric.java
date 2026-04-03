package com.sunbeam;

public class NewGeneric {

	public static <T extends Number> T findMinimum(T[] array) {
		if (array == null || array.length == 0) {
			System.out.println("Array cannot be null or empty");
		}

		T min = array[0];
		for (T element : array) {
			if (element.doubleValue() < min.doubleValue()) {
				min = element;
			}
		}
		return min;

	}

	public static void main(String[] args) {
		Integer[] intArray = { 3, 1, 4, 1, 5 };
		Double[] doubleArray = { 3.5, 2.1, 4.6, 1.0 };

		System.out.println("Minimum in Integer array: " + findMinimum(intArray));
		System.out.println("Minimum in Double array: " + findMinimum(doubleArray));
	}
}
