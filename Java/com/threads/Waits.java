package com.threads;
public class Waits extends Thread  {
	int sum=0;
	public void run()
    {
        synchronized (this)
        {
            for (int i = 0; i < 5; i++) {
 
                sum += i;
            }
            notify();
        }
    }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 Waits t1 = new Waits();
		   t1.start();
		   synchronized(t1) {
		   try {
			   System.out.println("waiting for few seconds");
			   t1.wait();
		   }catch(InterruptedException e) {
				System.out.println(e);
			}
		   System.out.println("Total is: " +t1.sum);
		   }
			
		}
  }
    



