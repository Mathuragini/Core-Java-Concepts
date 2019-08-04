package com.example.polymorphism.methodoverloading;

class Adder1 {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class ChangeArg1 {

	public static void main(String[] args) {

		System.out.println(Adder1.add(11, 11));
		System.out.println(Adder1.add(11, 11, 11));
	}

}
