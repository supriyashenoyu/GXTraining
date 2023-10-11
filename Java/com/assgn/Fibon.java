package com.assgn;

import java.util.Scanner;

public class Fibon {
	public static boolean isfibon(int a) {
		int t1=0,t2=1,t3=0;
		while(t3<a) {
			t3=t1+t2;
			t1=t2;
			t2=t3;
		}
		if(t3==a) {
			return true;
		}
		return false;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		boolean fib=isfibon(n);
		if(fib) {
		System.out.println("Fibonacci Number");}
		else {
			System.out.println("Not Fibonacci Number");	
		}

	}

}
