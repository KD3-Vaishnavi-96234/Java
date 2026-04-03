package day2;

import java.util.Scanner;

public class Assignment_q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = sc.nextInt();
		
		System.out.println("Given number: "+i);
		System.out.println("binary: " + Integer.toBinaryString(i));
		System.out.println("octal: " + Integer.toOctalString(i));
		System.out.println("hexadecimal: " + Integer.toHexString(i));
	}

}
