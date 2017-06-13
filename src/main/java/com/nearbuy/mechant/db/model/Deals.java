package com.nearbuy.mechant.db.model;

public class Deals {
	
	int deal_ID;
	String deal_name;
	int price;
	int discount;
	
	public Deals(int id, String dname,int dprice,int discount)
	{
		this.deal_ID=id;
		this.deal_name=dname;
		this.price=dprice;
		this.discount=discount;
	}
	
	public int getDeal_ID() {
		return deal_ID;
	}
	public void setDeal_ID(int deal_ID) {
		this.deal_ID = deal_ID;
	}
	public String getDeal_name() {
		return deal_name;
	}
	public void setDeal_name(String deal_name) {
		this.deal_name = deal_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
