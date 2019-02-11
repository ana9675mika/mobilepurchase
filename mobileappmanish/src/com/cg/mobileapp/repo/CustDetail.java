package com.cg.mobileapp.repo;

import java.util.HashMap;
import java.util.Map;

import com.cg.mobileapp.Exception.MobileException;
import com.cg.mobileapp.bean.Customer;
import com.cg.mobileapp.bean.Mobile;

public interface CustDetail {
	
	public Map AddCustDetail(Customer c) throws MobileException;
	public void purchase(HashMap<Integer,Mobile> h1,HashMap<Integer,Customer> h2)throws MobileException;
	

}
