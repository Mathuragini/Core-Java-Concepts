package com.example.initializeObject;

public class ByMethod {

	int id;
	String name;

	//Initialize method to input data 
	void insertRecord(int i, String n) {
		id = i;
		name = n;
	}

	//method to print data
	void displayInformation() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		//Initialize objects
		ByMethod s1 = new ByMethod();
		ByMethod s2 = new ByMethod();
		
		//Input data
		s1.insertRecord(222, "Mathu");
		s2.insertRecord(111, "Sharma");
		
		//Data print
		s1.displayInformation();
		s2.displayInformation();

	}

}
