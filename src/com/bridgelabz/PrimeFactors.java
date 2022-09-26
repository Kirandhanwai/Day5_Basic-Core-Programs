package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactors {
	static void M1() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N = scanner.nextInt();
		System.out.println("The prime Factors of a given number are: ");

		int d = 2;
		while (N > 1) {
			if (N%d == 0) {
				System.out.println(d);
				N = N/d;
			}
			else 
				d++;
		}
		
		scanner.close();
	}

	public static void main(String[] args) {
		M1();

	}


}
