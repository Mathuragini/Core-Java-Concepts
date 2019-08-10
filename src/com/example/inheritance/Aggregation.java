package com.example.inheritance;

class Address {
	int streetNum;
	String city;
	String state;
	String country;

	Address(int street, String c, String st, String coun) {
		this.streetNum = street;
		this.city = c;
		this.state = st;
		this.country = coun;
	}

	@Override
	public String toString() {
		return "Address [streetNum=" + streetNum + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}

class StudentClass {
	int rollNum;
	String studentName;
	// Creating HAS-A relationship with Address class
	Address studentAddr;

	StudentClass(int roll, String name, Address addr) {
		this.rollNum = roll;
		this.studentName = name;
		this.studentAddr = addr;
	}

	@Override
	public String toString() {
		return "StudentClass [rollNum=" + rollNum + ", studentName=" + studentName + ", studentAddr=" + studentAddr
				+ "]";
	}

	
	

}
