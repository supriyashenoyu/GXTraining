package com.galaxe;

import com.galaxe.model.Order;

public class PlaceOrder {
	SellerPortal portal;
	
 public PlaceOrder(SellerPortal portal) {
		
		this.portal = portal;
	}
public void placeOrder(Order order) {
	System.out.println("Placing Order....."+order.toString());
	portal.CreateOder(order);
}
public void setPortal(SellerPortal portal) {
	this.portal=portal;
}
}
