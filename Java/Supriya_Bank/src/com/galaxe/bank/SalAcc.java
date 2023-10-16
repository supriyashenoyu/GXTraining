package com.galaxe.bank;

import java.util.List;

public class SalAcc implements Acc {
	double deposit;
	double withdrawl;
	long AccNo;
	double balance;
	String currency;
	SalAcc(){
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
	public void getDeposit1() {
		System.out.println("amount of "+deposit+" deposited to account no "+AccNo+" in "+currency);
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public void setDeposit(double deposit,long AccNo) {
		this.deposit = deposit;
		this.AccNo=AccNo;
	}
	public void setDeposit(double deposit,long AccNo,String currency) {
		this.deposit = deposit;
		this.AccNo=AccNo;
		this.currency=currency;
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
	@Override
	public float setDeposit(float amount) {
		return amount;
		// TODO Auto-generated method stub
		
	}
	@Override
	public float Withdrawal(float amount) {
		return amount;
		// TODO Auto-generated method stub
		
	}
	@Override
	public float transfer(long srcAcc, long tarAcc, float amount) {
		return amount;
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Float> history(int history) {
		return null;
		// TODO Auto-generated method stub
		
	}
	

}
