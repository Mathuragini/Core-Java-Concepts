package com.example.constructor;

public class ConstructorChaining {

	ConstructorChaining() {
		System.out.println("This is the ParentClass Constructor ");
	}
}

class ConstructorChainingChild extends ConstructorChaining  {

	ConstructorChainingChild() {

		System.out.println("This is the ChildClass Constructor");
	}

	
	
	//Main class ===> Test.java
}

class ConstructorChainingChild2 extends ConstructorChainingChild{
	
	ConstructorChainingChild2() {

		System.out.println("This is the ChildClassTwo Constructor");
	}
	

	
}