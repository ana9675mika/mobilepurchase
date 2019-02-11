package com.cg.mobileapp.bean;

public class Mobile {


	private int quantity;
	private String company;
	private String name;
	
	@Override
	public String toString() {
		return " Company=" + company + ", Name=" + name + ", Quantity=" + quantity ;
	}

	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mobile( int quantity, String company, String name) {
		super();
		
		this.quantity = quantity;
		this.company = company;
		this.name = name;
	}
	
	
}
