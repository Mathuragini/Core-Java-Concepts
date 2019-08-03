package com.example.inheritance;

//Super Class
class Doctor {
	void Doctor_Details() {
		System.out.println("Doctor Details...");
	}
}

//Sub class
class Surgeon extends Doctor {
	void Surgeon_Details() {
		System.out.println("Surgen Detail...");
	}
}

public class Hospital {

	public static void main(String args[]) {
		Surgeon s = new Surgeon();
		s.Doctor_Details();
		s.Surgeon_Details();
	}
}
