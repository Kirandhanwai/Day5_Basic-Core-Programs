package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumber {
	static void M1() {
		int num1 = 0, num2 = 0;
		System.out.println("Enter a two numbers to swap");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		System.out.println("Tha numbers before swap num1= " + num1 + " num2= " + num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;
			
		System.out.println("Tha numbers after swap num1= " + num1 + " num2= " + num2);
		scanner.close();
		
	}

	public static void main(String[] args) {
		M1();
	}


}
