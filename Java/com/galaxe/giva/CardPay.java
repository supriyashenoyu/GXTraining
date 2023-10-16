package com.galaxe.giva;

public class CardPay extends Payment {
	 String Uname, CexpDate, Cnumber;

	CardPay(double cash, String Uname,String CexpDate,String Cnumber) {
		super(cash);
		this.Uname=Uname;
		this.CexpDate=CexpDate;
		this.Cnumber=Cnumber;
		// TODO Auto-generated constructor stub
	}
	public void paymentDetails(double cash) {
		System.out.println("Payment of"+cash+"is done succefully through credit card");
	}

}
