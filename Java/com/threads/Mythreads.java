package com.threads;



public class Mythreads extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythreads obj= new Mythreads();
		ThreadGroup tg1 = new ThreadGroup("ParentGroup");   
		Thread t1 = new Thread(tg1,obj,"t1");
	    t1.start(); 
	    Thread t2 = new Thread(tg1,"t2");
	    t2.start(); 
	    try {
            System.out.println(
                "Waiting for Thread 2 to complete...");
            t1.wait();
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }
		

	}

}
