package com.nearbuy.mechant.db.model;
import java.util.*;
import java.io.Serializable;

public class Merchant implements Serializable {

		
	/**
	 * 
	 */
		private static final long serialVersionUID = -1286051722688219490L;
		int merchantId;
		String name;
		String location;
		String category;
		private  ArrayList<Deals> mydeals;
		int deal_counter;
		
		
		public Merchant(int id, String name, String location, String category, ArrayList<Deals> deals)
		{
			
			merchantId=id;
			this.name=name;
			this.location=location;
			this.category=category;
			this.mydeals = deals;
		}
		
		public  ArrayList<Deals> myDealsList()
		{
			return mydeals;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMerchantId() {
			return merchantId;
		}
		public void setMerchantId(int merchantId) {
			this.merchantId = merchantId;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		
		@Override
	    public String toString() {
	        return String.format(
	                "Merchant[Id=%s, Name='%s', Location='%s' , Category='%s']",
	                merchantId, name, location,category);
	    }
				
}

