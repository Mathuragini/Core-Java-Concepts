package com.example.logics;

interface A1 {
	 default void a() {
		System.out.println("default method");
	};

	 static void b() {
			System.out.println("static method");
		};


	void c();

	void d();
}

abstract class B1 implements A1 {
//	public void c() {
//		System.out.println("I am c");
//	}
}

class M extends B1 {
//	public void a() {
//		System.out.println("I am a");
//	}

	public void b() {
		System.out.println("I am b");
	}
//
	public void d() {
		System.out.println("I am d");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
}

class Test5 {
	public static void main(String args[]) {
		A1 a = new M();
		a.a(); //default method
		//A1.a();
		//A1.a();
		A1.b();  //static method
		a.c();
		a.d();
	}
}