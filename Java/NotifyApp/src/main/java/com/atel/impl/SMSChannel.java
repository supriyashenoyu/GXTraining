package com.atel.impl;

import com.atel.CommunicationChannel;

public class SMSChannel implements CommunicationChannel {
	@Override
	public void sendMessage(String Message) {
		System.out.println("SMS Channel : "+Message);
	}
		
	

}
