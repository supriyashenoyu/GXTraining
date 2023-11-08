package com.galaxe.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.galaxe.model.LoanDetails;
import com.galaxe.model.PersonalDetails;
import com.galaxe.service.BankServices;
import com.galaxe.service.LoanCalculator;
@Component
@Qualifier("hdfcBankService")
public class HdfcBankService implements BankServices {
	
	@PostConstruct
	void init() {
		System.out.println("HdfcBankService Initialised.....");
	}
	//@Autowired	
	@Inject
	@Qualifier("hdfcLoanCalculator")
private LoanCalculator calculator;


	public HdfcBankService(LoanCalculator calculator) {
	super();
	this.calculator = calculator;
}
	

	public HdfcBankService() {
	
	
}
	public void setcalculator(LoanCalculator calculator) {
		//System.out.println("234");
	this.calculator = calculator;
}
	@Override
	public double processLoan(PersonalDetails details,LoanDetails loandetails) throws Exception {
//		double interest=calculator.calculateInterest(loandetails.getLoanType());
//		return loandetails.getAmount()*interest*loandetails.getTenure()/100;
		throw new Exception();
//		
	}
	@PreDestroy()
	void destroy() {
		System.out.println("HdfcBankService Closed.....");
	}

}
