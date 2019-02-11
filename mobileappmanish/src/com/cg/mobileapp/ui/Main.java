package com.cg.mobileapp.ui;
import com.cg.mobileapp.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.mobileapp.Exception.MobileException;
import com.cg.mobileapp.bean.Customer;
import com.cg.mobileapp.repo.Customerdetails;
import com.cg.mobileapp.service.ShowMobDetails;
import com.cg.mobileapp.util.Mobiledetails;



public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) throws MobileException {
		// TODO Auto-generated method stub
		int option=0;
		ShowMobDetails smd=new ShowMobDetails() ;
		Mobiledetails m1=new Mobiledetails();
	      Scanner sc=new Scanner(System.in);
	      do {
//	  		This is to display the menu
	  		System.out.println("1. Menu");
	  		System.out.println("2. Purchase Mobile ");
	  		System.out.println("3. Exit");

	  		option = sc.nextInt();

	  		switch (option) {
	  		case 1:
	  			//Case1: is to take inputs from the user and to validate the user inputs
	  			
	  			m1.AddmobDetails();
	  			m1.ShowList();
	  		    break;

	  		case 2:
	  			
	  			Scanner s=new Scanner(System.in);
	  			System.out.println("Enter your Name");
	  			String name=s.next();
	  			if(!smd.validateFirstName(name))
	  				throw new MobileException("Inavlid Name...");
	  			System.out.println("Enter your Phn no.");
	  			String phn=s.next();
	  			if(!smd.validateMobNo(phn))
					throw new MobileException("Invalid Mobile Number...");
				
	  			System.out.println("Enter your Mobileid");
	  			int mobileid=s.nextInt();
	  			
	  			Customer c=new Customer(name, phn, mobileid);
	  			Customerdetails cd=new Customerdetails();
	  			cd.AddCustDetail(c);
	  		    cd.show();
	  		    cd.purchase(m1.h1,cd.h2);
	  		         
	  			break;
	  		
	  		default:
	  		case 5:
	  			System.out.println("Exited...");
	  			break;
	  		}

	  	} while (option != 3);
	  	sc.close();
	  }  

	}


