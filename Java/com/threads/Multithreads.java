package com.threads;



public class Multithreads extends Thread {

	public static void main(String[] args) {
		Multithreads m1= new Multithreads();
		m1.setName("ft1");
		m1.start();
		
		// TODO Auto-generated method stub
		Multithreads m2= new Multithreads();
		m2.setName("ft2");
		m2.start();
		
	   System.out.println("name"+currentThread(). getName());
		

	}
	public void run() {
		System.out.println(currentThread(). getName()+"running");
	}

}

