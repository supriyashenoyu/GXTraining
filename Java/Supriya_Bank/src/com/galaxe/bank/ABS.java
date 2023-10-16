package com.galaxe.bank;

import java.util.List;

abstract class ABS implements Acc{
	public abstract float setDeposit(float amount);
	public abstract float Withdrawal(float amount);
    public  float transfer(long srcAcc, long tarAcc, float amount) {
		return amount;
    	
    }
	public  List<Float> history(int history){
		return null;
		
	}

}
