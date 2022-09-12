package com.infosys.inheritence.parameterized.demo2;
class Customer {
	private String customerId;
	private String customerName;
	public Customer(String customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		System.out.println("I am the parameterized constructor of Parent class");
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + this.customerId);
		System.out.println("Customer Name : " + this.customerName);
	}
}
class RegularCustomer extends Customer {
	private float discount;
	public RegularCustomer(String custId, String custName) {
		//System.out.println("I am before the constructor call");//Constructor call must be the first statement in a constructor
		super(custId, custName); // Invoking the parent class parameterized constructor and this has to be first line
		this.discount = 5.0f;
		System.out.println("I am the parameterized constructor of the child class");
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
}
public class Tester {
	public static void main(String[] args) {
		RegularCustomer regularCustomer = new RegularCustomer("C1010", "Johns Kora");
		regularCustomer.displayCustomerDetails();
	}
}
