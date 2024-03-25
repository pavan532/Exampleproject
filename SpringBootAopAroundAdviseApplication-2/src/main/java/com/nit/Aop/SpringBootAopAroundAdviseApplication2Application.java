package com.nit.Aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.Aop.Service.BankService;

@SpringBootApplication
public class SpringBootAopAroundAdviseApplication2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringBootAopAroundAdviseApplication2Application.class, args);
		
		BankService bank=context.getBean(BankService.class);
		
		String accnumber = "1234";
		
		bank.displayBalance(accnumber);
		context.close();
	}

}
