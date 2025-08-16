package com.nt.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
	@Override
	public String registerCustomerGroup(Iterable<Coustomer> list) {
		if(list != null) {
			Iterable<Coustomer> it = cousRepo.saveAll(list);
			int size = ((Collection)it).size();
			List<Integer> custid = new ArrayList();
			it.forEach(cust->{
				custid.add(cust.getCno());
			});
			
			return size+"no.of customer are registered having the id values"+custid .toString();
		}else {
			throw new IllegalArgumentException("Invalid Input");
		}
		
	}
	@Override
	public boolean isCustomerAvaliable(Integer id) {
	     boolean flag = cousRepo.existsById(id);
		return flag;
	}

}
