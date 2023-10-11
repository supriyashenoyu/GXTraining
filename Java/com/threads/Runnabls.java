package com.threads;



public class Runnabls implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside thread");
		
	}
	public static void main(String[] args) {
		Runnabls v = new Runnabls();
		Thread t=new Thread(v);
		t.start();
		System.out.println("Outside thread");
		
	}

}

