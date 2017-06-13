package com.nearbuy.mechant.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nearbuy.mechant.db.model.Deals;
import com.nearbuy.mechant.db.model.Merchant;
import com.nearbuy.mechant.db.repository.MerchantRepository;

//import java.util.ArrayList;
//import com.nearbuy.mechant.db.model.Merchant;

@Service
public class MerchantDealsService {

	@Autowired
	private MerchantRepository repository;
	
	public MerchantDealsService() {
		// TODO Auto-generated constructor stub
	}

	
	public ArrayList<Deals> showDeals(Integer merchantId)
	{
		//return "Deals by MerchantID: " + merchantId +" requested.";
		//System.out.println("Deals by MerchantID: "+merchantId+" : ");
		Merchant m1=repository.findBymerchantId(merchantId);
		return m1.myDealsList();
	}

}
