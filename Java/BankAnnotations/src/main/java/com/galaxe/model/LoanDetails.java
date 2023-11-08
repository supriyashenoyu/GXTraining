package com.galaxe.model;

public class LoanDetails {
	private String loanType;
	private int tenure;
	private double amount;
	@Override
	public String toString() {
		return "LoanDetails [loanType=" + loanType + ", tenure=" + tenure + ", amount=" + amount + "]";
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
