package com.cg.mobileapp.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.mobileapp.Exception.MobileException;
import com.cg.mobileapp.bean.Customer;
import com.cg.mobileapp.bean.Mobile;

public interface Show {
	public Map AddCustDetail(Customer c) throws MobileException;
	public void purchase(HashMap<Integer,Mobile> h1,HashMap<Integer,Customer> h2) throws MobileException;
	public boolean validateMobNo(String mobNo);
	 public boolean isValidEmailAddress(String email);
	boolean validateFirstName(String name);

}
