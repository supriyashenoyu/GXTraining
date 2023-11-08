package com.galaxe.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.galaxe.config.PropertyConfig;
import com.galaxe.model.LoanDetails;
import com.galaxe.service.LoanCalculator;

@Component
@Qualifier("iciccLoanCalculator")
public class IciccLoanCalculator implements LoanCalculator{
	@PostConstruct
	void init() {
		System.out.println("IciccLoanCalculator Initialised.....");
	}
	
	@Autowired
PropertyConfig propertyConfig;
	@Override
	
	public float calculateInterest(String type) {
		{
			if("home".equalsIgnoreCase(type))
				return propertyConfig.getHome();
			if("personal".equalsIgnoreCase(type))
				return propertyConfig.getPersonal();
			else if("car".equalsIgnoreCase(type))
				return propertyConfig.getCar();
		}
		return 9;
		
	}
	@PreDestroy()
	void destroy() {
		System.out.println("IciccLoanCalculator Closed.....");
	}

}
