package com.example.errorhandling;

import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			int c = a / b;
//			System.out.print("Answer is :" + c);
//			

			try {
				int a = scan.nextInt();
				int b = scan.nextInt();
				int c = a / b;
				System.out.print("Answer is :" + c);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
