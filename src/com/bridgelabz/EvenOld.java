package com.bridgelabz;

import java.util.Scanner;

public class EvenOld {
		static void M1()	{
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sc.close();
			if (num % 2 == 0) {
				System.out.println("Number is even");
			}
			else {
				System.out.println("Number is odd");
			}
			
		}
		 
		public static void main(String[] arg) {
			M1();
			 
		}

	}
