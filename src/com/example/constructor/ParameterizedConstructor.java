package com.example.constructor;

public class ParameterizedConstructor {

	int id;
	String name;

	public ParameterizedConstructor(int i, String n) {

		id = i;
		name = n;
	}

	void display() {
		System.out.print(id + " " + name);
	}

	public static void main(String[] args) {
		ParameterizedConstructor parameter = new ParameterizedConstructor(106, "Mathu");
		parameter.display();

	}

}
