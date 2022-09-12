package com.infosys.demos.inheritence.parameterized.demo1;
class Customer {
	private String customerId;
	private String customerName;
	public Customer(String customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public Customer() {
		System.out.println("Parent Default Constructor");
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println();
	}
}
