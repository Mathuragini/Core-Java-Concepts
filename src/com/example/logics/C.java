package com.example.logics;

interface A {
	default void msg() {
		System.out.println("Hello");
	}
}

interface B {
	default void msg() {
		System.out.println("Welcome");
	}
}
class C implements B {

	public static void main(String args[]) {
		C obj = new C();
		obj.msg();
	}
}