package com.example.initializeObject;

public class ByConstructor {

	int id;
	String name;

	// creating a parameterized constructor
	ByConstructor(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// creating objects and passing values
		ByConstructor s1 = new ByConstructor(111, "Mathu");
		ByConstructor s2 = new ByConstructor(222, "Sharma");
		
		// calling method to display the values of object
		s1.display();
		s2.display();

	}

}
