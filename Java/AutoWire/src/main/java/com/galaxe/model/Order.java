package com.galaxe.model;

public class Order {
	private int id;
	private String productName;
	private float quantity;
	private double price;
	@Override
	public String toString() {
		return "Order [id=" + id + ", productName=" + productName + ", quantity=" + quantity + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
