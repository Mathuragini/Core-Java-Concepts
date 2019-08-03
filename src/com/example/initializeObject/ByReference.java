package com.example.initializeObject;

public class ByReference {

	int id;
	String name;

	public static void main(String args[]) {
		//create objects
		ByReference ref = new ByReference();
		
		//Initialize objects
		ref.id = 1006;
		ref.name = "mathu";
		
		// printing data
		System.out.println(ref.id + " " + ref.name);

	}

}
