package com.galaxe.bank;

import java.util.List;
public interface Acc {
	abstract float setDeposit(float amount);

	abstract float Withdrawal(float amount);

	abstract float transfer(long srcAcc, long tarAcc, float amount);
	

	abstract List<Float> history(int history);

	public static void main(String[] args) {
		System.out.println("This is my interface");
	}

}
