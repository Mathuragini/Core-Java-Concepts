package com.example.constructor;

public class ConstructorOverloading {

	int value1;
	int value2;

	//Default constructor
	ConstructorOverloading() {

		this.value1 = 10;
		this.value2 = 20;
		System.out.println("Inside 1st Constructor");
	}

	 //creating one arg constructor  
	ConstructorOverloading(int a) {

		this.value1 = a;
		System.out.println("Inside 2nd Constructor");
	}

	 //creating two arg constructor  
	ConstructorOverloading(int a, int b) {
		this.value1 = a;
		this.value2 = b;
		System.out.println("Inside 3rd Constructor");
	}

	//method to display values
	void display() {
		System.out.println("First Value :" + value1);
		System.out.println("Second Value :" + value2);

	}

	public static void main(String args[]) {
		
		//Creating objects
		ConstructorOverloading cons1 = new ConstructorOverloading();
		ConstructorOverloading cons2 = new ConstructorOverloading(30);
		ConstructorOverloading cons3 = new ConstructorOverloading(30, 40);
		
		//Display values
		cons1.display();
		cons2.display();
		cons3.display();
	}
}
