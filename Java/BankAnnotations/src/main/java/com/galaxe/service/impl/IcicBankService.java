package com.galaxe.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.galaxe.model.LoanDetails;
import com.galaxe.model.PersonalDetails;
import com.galaxe.service.BankServices;
import com.galaxe.service.LoanCalculator;
@Component
@Qualifier("icicBankService")
public class IcicBankService implements BankServices {
	@PostConstruct
	void init() {
		System.out.println("IcicBankService Initialised.....");
	}
	@Autowired
	@Qualifier("iciccLoanCalculator")
	
private LoanCalculator calculator;



	public IcicBankService(LoanCalculator calculator) {
	super();
	this.calculator = calculator;
}
	

	public IcicBankService() {
	
	
}
	public void setcalculator(LoanCalculator calculator) {
		
	this.calculator = calculator;
}
	@Override
	public double processLoan(PersonalDetails details,LoanDetails loandetails) {
		double interest=calculator.calculateInterest(loandetails.getLoanType());
		
		return loandetails.getAmount()*interest*loandetails.getTenure()/100;
		
	}
	@PreDestroy()
	void destroy() {
		System.out.println("IcicBankService Closed.....");
	}

}
