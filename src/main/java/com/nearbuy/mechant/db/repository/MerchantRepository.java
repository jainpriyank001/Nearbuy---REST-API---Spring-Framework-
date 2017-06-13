package com.nearbuy.mechant.db.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nearbuy.mechant.db.model.Merchant;

public interface MerchantRepository extends MongoRepository<Merchant,Integer>{

	public Merchant findBymerchantId(Integer Id);
}
