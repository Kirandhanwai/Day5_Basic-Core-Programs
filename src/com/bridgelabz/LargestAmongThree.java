package com.bridgelabz;

import java.util.Scanner;

public class LargestAmongThree {
	static void M1() {
		int num1 = 0, num2 = 0, num3 = 0, num = 0;
		System.out.println("Enter the three numbers");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		if (num1 > num2 && num1 > num3) {
			num = num1;
		} else if (num2 > num1 && num2 > num3) {
			num = num2;
		} else {
			num = num3;
		}
		System.out.println("Greatest number is " + num);

		scanner.close();
	}

	public static void main(String[] args) {
		M1();
	}

}
