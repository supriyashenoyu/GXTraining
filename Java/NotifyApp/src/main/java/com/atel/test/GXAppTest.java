package com.atel.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atel.MessageSender;
import com.atel.impl.Car;
public class GXAppTest {
	public static void main(String[] args) {
		
		BeanFactory factory = new ClassPathXmlApplicationContext("app-context.xml");
		
//		MessageSender sender=(MessageSender)factory.getBean("messageSender");
//	
//		sender.notifyUser("Your plan is expiring...");
//		System.out.println(sender.hashCode());
//		MessageSender sender1=(MessageSender)factory.getBean("messageSender");
//		sender1.notifyUser("Your plan is expiring...");
//		System.out.println(sender1.hashCode());
//		((ClassPathXmlApplicationContext)factory).close();
		Car car=factory.getBean(Car.class);
		System.out.println(car.toString());
		
	}
	
	

	
}
