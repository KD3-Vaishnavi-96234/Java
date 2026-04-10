package assignment5;

import java.util.Scanner;

public class AQ1 {
	
	public static void main(String[] args) {
		String str, revStr = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		
		for (int i=str.length()-1; i>=0; i--) {
			revStr =revStr + str.charAt(i);
		}
		
		System.out.println("Reversed String : "+ revStr);
		sc.close();

	}
}
