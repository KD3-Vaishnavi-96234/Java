package com.sunbeam;

public class ReverseString {
	public static void main(String[] args) {
		String original = "String";
		String reverse = "";
		char[] charArray = original.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			reverse = reverse + charArray[i];

		}
		System.out.println(reverse);
	}

}
