package com.example.polymorphism.methodoverloading;

//Overloading � Different Number of parameters in argument list

class DisplayOverloading {
	public void disp(char c) {
		System.out.println(c);
	}

	public void disp(char c, int num) {
		System.out.println(c + " " + num);
	}
}

public class ChangeArg {

	public static void main(String[] args) {
		DisplayOverloading obj = new DisplayOverloading();
		obj.disp('a');
		obj.disp('a', 10);

	}

}
