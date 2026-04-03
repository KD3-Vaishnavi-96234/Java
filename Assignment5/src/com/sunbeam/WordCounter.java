package com.sunbeam;

public class WordCounter {
	public static void main(String[] args) {
		String s = "Java is object oriented language ";
		int count = 0;
		if (s == null || s.trim().isEmpty()) {
			System.out.println("Word count: 0");

		}
		String[] words = s.trim().split(" ");
		count = words.length;
		System.out.println("no. of words in given String are: " + count);

	}

}
