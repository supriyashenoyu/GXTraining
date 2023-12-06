package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P2;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("---Swapping of 2 numbers---");
		System.out.println("Enter first number");
		int fn=sc.nextInt();
		System.out.println("Enter second number");
		int sn=sc.nextInt();
		System.out.println("first number is "+fn+" and second number is "+sn);
		P2 opr=(fn1,sn1)->{
			int t=fn1;
			fn1=sn1;
			sn1=t;
			System.out.println("After swapping");
			System.out.println("first number is "+fn1+" and second number is "+sn1);
			
		};
		opr.swap(fn, sn);
		
		

	}

}
