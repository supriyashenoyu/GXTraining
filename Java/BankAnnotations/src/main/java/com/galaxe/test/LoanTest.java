package com.galaxe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.galaxe.config.BeanConfigation;
import com.galaxe.model.LoanDetails;
import com.galaxe.model.PersonalDetails;
import com.galaxe.service.BankServices;
import com.galaxe.service.impl.HdfcBankService;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoanTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext beanFactory  = new AnnotationConfigApplicationContext(BeanConfigation.class);
		//BeanFactory factory =new ClassPathXmlApplicationContext("context.xml");
		//BankServices bankservices =(BankServices) factory.getBean("bankservice");
		BankServices bankservices = beanFactory.getBean("hdfcBankService",BankServices.class);
		//BankServices bankservices = beanFactory.getBean(HdfcBankService.class);
		PersonalDetails details= new PersonalDetails();
		details.setName("suppi");
		details.setAge(22);
		details.setEmail("sup@gmail.com");
		details.setPhNo("287621872");
		LoanDetails ldetails = new LoanDetails();
		ldetails.setAmount(10000);
		ldetails.setLoanType("home");
		ldetails.setTenure(3);
		double total=bankservices.processLoan(details, ldetails);
		System.out.println("total amount is "+total);
		((AnnotationConfigApplicationContext) beanFactory).close();
	}

}
