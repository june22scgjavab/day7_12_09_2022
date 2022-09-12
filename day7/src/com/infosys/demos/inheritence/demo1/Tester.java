package com.infosys.demos.inheritence.demo1;
class Customer {
	public Customer() {
		// 3: Parent constructor will be executed
		System.out.println("Creating a customer...");
		// 4: The flow will go back to the child constructor
	}
}
class RegularCustomer extends Customer {
	public RegularCustomer() {
		// 2: This constructor will then call the parent constructor
		System.out.println("It is a regular customer!");
		// 5: The flow will finally come here
	}
}
public class Tester {
	public static void main(String[] args) {
		RegularCustomer regularCustomer = new RegularCustomer();
		// 1: This line will be executed first and the flow will go to [2]
	}
}
