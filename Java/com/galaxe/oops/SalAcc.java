package com.galaxe.oops;
public class SalAcc extends Account {
	double deposit;
	double withdrawl;
	long AccNo;
	double balance;
	SalAcc(){
		super("supriya");
		System.out.println("SalAcc is child class");
	}
	public void Transaction() {
		System.out.println("Transaction going on");
	}
	public void History() {
		System.out.println("History is");
	}
	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdrawl() {
		return withdrawl;
	}

	public void setWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void Balance() {
		System.out.println("This salary account with " + balance +" balance");
	}
	

}
