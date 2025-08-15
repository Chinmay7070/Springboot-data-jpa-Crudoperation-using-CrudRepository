package com.nt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repository.CustomerRepo;
import com.nt.entity.Coustomer;

@Service("custService")
public  class CustomermagtServiceImpl implements ICustomermanagemetService{

	@Autowired
	private CustomerRepo cousRepo;
	@Override
	public String registerCustomer(Coustomer cust) {
		
		Coustomer cust1 = cousRepo.save(cust);
		
		return "Customer obj is saved(record inserted) having the id value" +cust1.getCno();
	}

}
