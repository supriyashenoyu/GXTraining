package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P15;

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
		P15 opr=(n1)->{
		int t1=0,t2=1,t3=0;
		while(t3<n1){
			t3=t1+t2;
			t1=t2;
			t2=t3;
		}
		//t3==n1 ?true:false;
		if(t3==n1) {
			return true;
		}
		return false;
		};
		boolean fib=opr.fibon(n);
		if(fib) {
		System.out.println("It is a Fibonacci Number");}
		else {
			System.out.println("It is not a Fibonacci Number");	
		}

	}

}
