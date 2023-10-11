package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newSingleThreadExecutor();
		Runnable run = () -> {
			System.out.println(":: " + Thread.currentThread().getName());
		};
	    es.submit(run);  
	    es.shutdown();

	}

}
