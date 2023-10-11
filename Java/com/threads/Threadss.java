package com.threads;


public class Threadss extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadss th= new Threadss();
		th.start();
		System.out.println("outside of thread");

	}
	public void run() {
		System.out.println("Inside of thread");
		
	}

}

