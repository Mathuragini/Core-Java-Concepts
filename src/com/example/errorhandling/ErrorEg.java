package com.example.errorhandling;

class StackOverflow {
	public static void test(int i) {
		// No correct as base condition leads to
		// non-stop recursion.
		if (i == 0)
			return;
		else {
			test(i++);
		}
	}
}

public class ErrorEg {

	public static void main(String[] args) {

		// eg of StackOverflowError
		StackOverflow.test(5);
	}
}