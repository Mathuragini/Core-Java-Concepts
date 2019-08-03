package com.example.inheritance;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
	}

}
