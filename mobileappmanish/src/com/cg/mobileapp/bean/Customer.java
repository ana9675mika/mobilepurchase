package com.cg.mobileapp.bean;

import java.util.Date;

public class Customer {
	
	private String name;
	private String phn;
	private int mobileid;
	
	public Customer(String name, String phn, int mobileid) {
		super();
		this.name = name;
		this.phn = phn;
		this.mobileid = mobileid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	@Override
	public String toString() {
		return " Name=" + name + ", Phn=" + phn + ", Mobileid=" + mobileid ;
	}
	
	
	
}
