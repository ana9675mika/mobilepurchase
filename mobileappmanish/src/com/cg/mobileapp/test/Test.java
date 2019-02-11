package com.cg.mobileapp.test;
import static org.junit.Assert.*;



import com.cg.mobileapp.Exception.MobileException;
import com.cg.mobileapp.repo.Customerdetails;
import com.cg.mobileapp.service.ShowMobDetails;


public class Test {
	ShowMobDetails smd=new ShowMobDetails(new Customerdetails());
	//@Test (expected = MobileException.class)
	public void test() throws MobileException{
		
		//testcase ni bna h
	}

}
