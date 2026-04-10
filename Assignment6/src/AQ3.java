package assignment5;

import java.util.Scanner;

public class AQ3 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		str = str.trim();		
		String[] strArr = str.split(" ");
		
//		int count = 0;
//		int exCount = 0;
//		boolean running = true;
//		for (int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == ' ') {
//				running = false;
//				count++;
//			} else {
//				exCount++;
//				running = true;
//			}
//		}
		System.out.println("Number of words in give string : "+ strArr.length);
		
		sc.close();
	}
}
