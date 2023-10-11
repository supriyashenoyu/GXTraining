package com.threads;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Concur extends Thread{
	static ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap<String, Integer>();
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"running");
		System.out.println(hm);
		Iterator<String> iterator = hm.keySet().iterator();
		while(iterator.hasNext())
		    iterator.next();
		hm.put("key4",4);

		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		hm.put("key1",1);
		hm.put("key2", 2);
		// TODO Auto-generated method stub
		Concur c1 = new Concur();
		Concur c2 = new Concur();
		c1.start();
		c2.start();
			
		
		

	}
	

}

