package com.bridgelabz;

import java.util.Scanner;

public class PowerofTwo {
	static void m1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the power value of N");
		int N = scanner.nextInt();
		int powerOfTwo = 1;
		if (N < 31) {

			for (int i = 0; i < N; i++) {
				powerOfTwo *= 2;
			}
			System.out.println(powerOfTwo);
		} else {
			System.out.println(N + " is greater than or equal to 31: ");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		m1();

	}


}
