package com.galaxe.giva;

class Jewel  {
	String material;
	int price;
	double d;
	public Jewel(String material,int price,double d) {
		this.price=price;
		this.material=material;		
		this.price=price;
		this.d=d;
	}
	public  void display() {
		System.out.println("Material used "+material);
		System.out.println("Total Cost "+price);
		price-=price*(d/100);
		System.out.println("Discounted price: "+price);
	}
}