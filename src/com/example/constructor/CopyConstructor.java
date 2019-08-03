package com.example.constructor;

public class CopyConstructor {
	int id;
	String name;

	 //constructor to initialize integer and string  
	CopyConstructor(int i, String n) {
		this.id = i;
		this.name = n;
	}

	 //constructor to initialize another object  
	CopyConstructor(CopyConstructor constructor) {

		id = constructor.id;
		name = constructor.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		CopyConstructor original = new CopyConstructor(106, "MathuKutty");
		CopyConstructor copy = new CopyConstructor(original);
		original.display();
		copy.display();
	}
}
