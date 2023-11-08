package com.galaxe.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:application.properties")
@Component
public class PropertyConfig {
	
	@Value("${personal}")
	private float personal;
	@Value("${home}")
	private float home;
	@Value("${car}")
	private float car;
	public float getPersonal() {
		return personal;
	}
	public void setPersonal(float personal) {
		this.personal = personal;
	}
	public float getHome() {
		return home;
	}
	public void setHome(float home) {
		this.home = home;
	}
	public float getCar() {
		return car;
	}
	public void setCar(float car) {
		this.car = car;
	}

}
