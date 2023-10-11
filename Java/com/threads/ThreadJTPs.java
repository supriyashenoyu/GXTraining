package com.threads;



public class ThreadJTPs extends Thread {
	public void run()
	{
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+"run");
			
		
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadJTPs t1 = new ThreadJTPs();
		ThreadJTPs t2 = new ThreadJTPs();
		t1.start();
		t2.start();
		for(int i=0;i<3;i++) {
			t1.yield();
			System.out.println(Thread.currentThread().getName()+"running");
			
		
		}
		
		

	}

}

