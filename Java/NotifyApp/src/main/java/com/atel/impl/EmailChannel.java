package com.atel.impl;

import com.atel.CommunicationChannel;

public class EmailChannel implements CommunicationChannel{

	@Override
	public void sendMessage(String Message) {
		System.out.println("Email Channel : "+Message);
		
	}
	

}
