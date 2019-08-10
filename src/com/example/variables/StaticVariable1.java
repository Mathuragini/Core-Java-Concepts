package com.example.variables;

public class StaticVariable1 {

	static int count = 0;

	public void increment() {
		count++;
	}

	public static void main(String args[]) {
		StaticVariable1 obj1 = new StaticVariable1();
		StaticVariable1 obj2 = new StaticVariable1();
		obj1.increment();
		obj2.increment();
		System.out.println("Obj1: count is=" + obj1.count);
		System.out.println("Obj2: count is=" + obj2.count);
	}

}
