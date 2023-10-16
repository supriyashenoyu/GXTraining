package com.galaxe.bank;

import java.io.IOException;

public class CurrentAcc extends Account{
	CurrentAcc() {
		super("suppi");
		
			
		
}
	public void Withdrawal() throws IOException{
		super.Withdrawal();
		System.out.println("child");
		
	}
	

}
