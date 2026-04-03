package com.sunbeam;

public class PalindromeString {

	public static void main(String[] args) {

		String s = "Racecar";
		String reverse = "";
		char[] charArray = s.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			reverse += charArray[i];
		}

		if (s.equalsIgnoreCase(reverse))
			System.out.println("Given String is a palindrome");
		else
			System.out.println("Given String is not a palindrome");

	}

}
