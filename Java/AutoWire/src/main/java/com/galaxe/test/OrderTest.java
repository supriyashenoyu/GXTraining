package com.galaxe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.galaxe.PlaceOrder;
import com.galaxe.model.Order;

public class OrderTest {
	public static void main(String[] args) {
		BeanFactory factory =new ClassPathXmlApplicationContext("context.xml");
		Order order=new Order();
		order.setId(1);
		order.setProductName("mobile cover");
		order.setQuantity(3);
		order.setPrice(150);
		PlaceOrder placeOrder=factory.getBean(PlaceOrder.class);
		placeOrder.placeOrder(order);
		
	}

}
