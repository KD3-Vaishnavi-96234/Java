package assignment5;

import java.util.Scanner;

public class AQ2 {

	public static void main(String[] args) {
		String str, revStr = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		for (int i=str.length()-1; i>=0; i--) {
			revStr =revStr +Character.toString(str.charAt(i));
		}

		if (str.equals(revStr)) {
			
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is Palindrome");
		}

		sc.close();
	}

}
