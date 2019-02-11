package com.cg.mobileapp.service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.mobileapp.Exception.MobileException;
import com.cg.mobileapp.bean.Customer;
import com.cg.mobileapp.bean.Mobile;
import com.cg.mobileapp.repo.Customerdetails;

public class ShowMobDetails implements Show {

	public ShowMobDetails(Customerdetails customerdetails) {
		// TODO Auto-generated constructor stub
	}

	public ShowMobDetails() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map AddCustDetail(Customer c) throws MobileException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void purchase(HashMap<Integer, Mobile> h1, HashMap<Integer, Customer> h2) throws MobileException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validateMobNo(String mobNo) {
			// TODO Auto-generated method stub
			Pattern pat = Pattern.compile("[6-9][0-9]{9}");
			Matcher mat = pat.matcher(mobNo);
			return mat.matches();
		}
	@Override
	 public boolean isValidEmailAddress(String email) {
         String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
         java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
         java.util.regex.Matcher m = p.matcher(email);
         return m.matches();
  }
	@Override
	public boolean validateFirstName( String name )
	   {
	      return name.matches( "[A-Z][a-zA-Z]*{20}" );
	   }

	

	
}
