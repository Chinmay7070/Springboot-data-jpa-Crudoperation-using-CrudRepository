package com.nt.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Service.ICustomermanagemetService;
import com.nt.entity.Coustomer;

@Component
public class CrudRepotestRunner implements CommandLineRunner {
  
	@Autowired
	private ICustomermanagemetService custService;
	
	@Override
	public void run(String... args) throws Exception {

		/*Coustomer cust = new Coustomer();
		cust.setCname("Chinmay");
		cust.setBillAmt(50000.0f);
		cust.setCaddrs("hyd");
		String msg = custService.registerCustomer(cust);
		System.out.println(msg);
		
		try {
		List<Coustomer> list = List.of(new Coustomer("raja","hyd",9000.0f),
				                        new Coustomer("chinmay","pune",10000.0f),
				                        new Coustomer("vaibhav","pune",10000.0f));
		String resultmsg = custService.registerCustomerGroup(list);
		System.out.print(resultmsg);
		}catch(Exception e) {
			e.printStackTrace();
		}*/	
		
        System.out.println("FIND METHODS IN CURD REPO");
        try {
        	boolean flag = custService.isCustomerAvaliable(1);
        	if(flag) {
        		System.out.println("CUSTOMER IS AVALABLE");
        	}
        	else {
        		System.out.print("CUSTOMER IS NOT AVALABLE");
        	}
        }
        	catch(Exception e) {
        		e.printStackTrace();
        	}
        

	}

}
