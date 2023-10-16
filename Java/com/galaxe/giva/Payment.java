package com.galaxe.giva;

import java.util.Scanner;

public class Payment {
	protected double cash;
	Payment(double cash) 
	{
			this.cash = cash;
		}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}
	public void paymentDetails(double cash) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Do you want to order?(yes/No");
		String n = sc.next();
		if(n=="yes") {
			System.out.println("Card or Cash payment?");
			String pay = sc.next();
			if(pay=="card") {
				CardPay cap= new CardPay(cash,"supriya","12/12/2023","d133k231");
			}
            if(pay=="cash") {
            	CashPay cp = new CashPay(cash);
            	
			}
		}
		else {
			
		}
		
		
	}

}
