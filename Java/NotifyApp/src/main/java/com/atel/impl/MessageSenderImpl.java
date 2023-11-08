package com.atel.impl;

import com.atel.CommunicationChannel;
import com.atel.MessageSender;

public class MessageSenderImpl implements MessageSender{
	CommunicationChannel channel;
	public void init() {
		System.out.println("Initialised......");
			
		
	}
	public MessageSenderImpl(CommunicationChannel channel) {
		this.channel = channel;
		System.out.println("Constructor Initialized 000"+channel);
	}
	public MessageSenderImpl() {
		
		System.out.println("Constructor Initialized ---"+channel);
	}
	public 	void setChannel(CommunicationChannel channel) {
		
		this.channel=channel;
		
	}
	@Override
	public void notifyUser(String Message) {
	
		channel.sendMessage(Message);
		
	}
	public void destroy() {
		System.out.println("Destroyed.....");
	}

}
