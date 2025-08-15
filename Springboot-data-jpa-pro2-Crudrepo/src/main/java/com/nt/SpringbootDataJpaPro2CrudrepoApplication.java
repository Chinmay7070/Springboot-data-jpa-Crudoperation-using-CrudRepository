package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.Service.ICustomermanagemetService;
import com.nt.entity.Coustomer;

@SpringBootApplication
public class SpringbootDataJpaPro2CrudrepoApplication {

	public static void main(String[] args) {
	 SpringApplication.run(SpringbootDataJpaPro2CrudrepoApplication.class, args);
		
//		 ICustomermanagemetService service= ctx.getBean("custService",ICustomermanagemetService.class);
//		 try {
//			 Coustomer cust = new Coustomer();
//			 cust.setCname("raja");
//			 cust.setBillAmt(9000.9f);
//			 cust.setCaddrs("hyd");
//			 
//			 
//			 String resultmsg = service.registerCustomer(cust);
//			 System.out.println(resultmsg);
//		 }catch(Exception e) {
//			 e.printStackTrace();
//		 }
	}

}
