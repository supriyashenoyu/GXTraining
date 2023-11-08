package com.galaxe.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.galaxe.service.BankServices;
import com.galaxe.service.LoanCalculator;
import com.galaxe.service.impl.HdfcBankService;
import com.galaxe.service.impl.HdfcLoanCalculator;
import com.galaxe.service.impl.IcicBankService;
import com.galaxe.service.impl.IciccLoanCalculator;
@Lazy
@Configuration

@ComponentScan(basePackages="com.galaxe")
public class BeanConfigation {
	@Bean
	public BankServices bankservices() {
		return new HdfcBankService();
	}
	@Bean
	public LoanCalculator loanCalculator() {
		return new HdfcLoanCalculator();
	}
	@Bean
	public BankServices icicBankService() {
		return new IcicBankService();
	}
	@Bean
	public LoanCalculator iciccLoanCalculator() {
		return new IciccLoanCalculator();
	}
	@Bean
	public PropertyConfig propertyConfig() {
		return new PropertyConfig();
		
	}

}
