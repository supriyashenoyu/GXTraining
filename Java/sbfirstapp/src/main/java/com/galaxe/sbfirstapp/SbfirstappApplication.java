package com.galaxe.sbfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.galaxe.sbfirstapp.beans.Car;

@SpringBootApplication
public class SbfirstappApplication {

	public static void main(String[] args) {
		ApplicationContext context = 
		SpringApplication.run(SbfirstappApplication.class, args);
		Car c=context.getBean(Car.class);
		System.out.println(c.toString());
	}

}
