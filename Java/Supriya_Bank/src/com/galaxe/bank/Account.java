package com.galaxe.bank;

import java.io.IOException;

public class Account {
	String Bname;
	String accType;
	long AccNo;
	String IfscCode;
	public double balance=5000;
	
	Account(){
		System.out.println("Account is main class");
	}
	Account(String name){
		System.out.println("Name of Account Holder is "+name);
	}
	public void Withdrawal() throws IOException { 
		System.out.println("Main");
		
	}
	public double getbalance() {
		return balance;
	}
	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		this.Bname = bname;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public long getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		this.AccNo = accNo;
	}

	public String getIfscCode() {
		return IfscCode;
	}

	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}
	


	

}
