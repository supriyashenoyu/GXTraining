package com.threads;


import java.util.*;

public class slJoins extends Thread{
	public void run() {
		for(int i=0;i<4;i++) {
		System.out.println(Thread.currentThread().getName()+"is running");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		slJoins t1= new slJoins();
		t1.setName("t1");
		slJoins t2= new slJoins();
		t2.setName("t2");
		slJoins t3= new slJoins();
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
		for(int i=0;i<5;i++) {
		t1.yield();
		}

	}

}
