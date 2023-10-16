package com.galaxe.giva;

class Necklace extends Jewel {
    String stone;
	public Necklace(String material,int price,String stone,double dis) {
		super(material,price,dis);
		this.stone=stone;
	}
	public void display() {
			super.display();
			System.out.println("Stone used "+stone);
		}
	
}
