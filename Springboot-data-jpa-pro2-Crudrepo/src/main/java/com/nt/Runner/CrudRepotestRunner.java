package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.Service.ICustomermanagemetService;
import com.nt.entity.Coustomer;

public class CrudRepotestRunner implements CommandLineRunner {
  
	@Autowired
	private ICustomermanagemetService custService;
	
	@Override
	public void run(String... args) throws Exception {

		Coustomer cust = new Coustomer();
		cust.setCname("Chinmay");
		cust.setBillAmt(50000.0f);
		cust.setCaddrs("hyd");
		String msg = custService.registerCustomer(cust);
		System.out.println(msg);


	}

}
