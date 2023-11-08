package com.galaxe.sbfirstapp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
public class Car {
	@Value("${model}")
	
	private String model;

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}
	@ReuestMapping("home")
	public String home() {
		return "home"
		
	}
	
	

}
