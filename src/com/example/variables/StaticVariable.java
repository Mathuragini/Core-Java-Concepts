package com.example.variables;

public class StaticVariable {

	public static String myClassVar = "class or static variable";

	public static void main(String[] args) {

		StaticVariable obj = new StaticVariable();
		StaticVariable obj2 = new StaticVariable();
		StaticVariable obj3 = new StaticVariable();

		// All three will display "class or static variable"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);

		// changing the value of static variable using obj2
		obj2.myClassVar = "Changed Text";

		// All three will display "Changed Text"
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);

	}

}
