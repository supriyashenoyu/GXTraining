package com.galaxe.service;
import com.galaxe.model.LoanDetails;
import com.galaxe.model.PersonalDetails;
public interface BankServices {
	double processLoan(PersonalDetails details,LoanDetails loandetails) throws Exception;

}
