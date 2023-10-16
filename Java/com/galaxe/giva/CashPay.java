package com.galaxe.giva;

public class CashPay extends Payment {

	CashPay(double cash) {
		super(cash);
		// TODO Auto-generated constructor stub
	}
	public void paymentDetails(double cash) {
		System.out.println("Payment of"+cash+"is done succefully through cash");
	}
	

}
