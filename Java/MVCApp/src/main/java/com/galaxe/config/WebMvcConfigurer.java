package com.galaxe.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class WebMvcConfigurer extends WebMvcConfigurationSupport {

	@Override
	protected void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		super.addViewControllers(registry);
	}

	@Override
	protected void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		super.configureViewResolvers(registry);
	}
	
}
