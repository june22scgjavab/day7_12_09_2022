package com.infosys.demos.inheritence.parameterized.demo1;
class RegularCustomer extends Customer {
	private float discount;
	public RegularCustomer(String custId, String custName) {
		this.setCustomerId(custId);
		this.setCustomerName(custName);
		this.discount = 5.0f;
		System.out.println("Child Constructor");
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
}
