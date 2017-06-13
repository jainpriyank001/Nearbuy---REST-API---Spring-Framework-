package com.nearbuy.mechant.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nearbuy.mechant.db.model.Deals;
import com.nearbuy.mechant.service.MerchantDealsService;


@RestController
@RequestMapping(value = "/merchants")
public class MerchantRestController {

	@Autowired
	private MerchantDealsService merDealsSvc;

	
	@RequestMapping(method = RequestMethod.GET)
		public String home() {
			return "Hello_World!";
			//return "Hi "+ mer.getName();
		}
		
	@RequestMapping(path="/{merchantId}", method = RequestMethod.GET)
	public String showMerchant(@PathVariable Integer merchantId) {
		return "You have requested data for merchantId " + merchantId + " .";
	}
	
	@RequestMapping(path="/{merchantId}/showmydeals",method= RequestMethod.GET)
	public ArrayList<Deals> showMerchantDeals(@PathVariable Integer merchantId) {
		return merDealsSvc.showDeals(merchantId);
		//return "Merchant Deals for merchant Id"+ merchantId + "requested.";
	}
	


	
	
	
//	@RequestMapping(path="/{merchantNAME}",method = RequestMethod.GET )
//	public String show_name(@PathVariable String merchantNAME) {
//		return "You have requested data for merchantNAME " + merchantNAME;
//	}
	

}
