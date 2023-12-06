package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P1;

public class SI {
//	static void Si(int p,int t,int r) {
//		int SI=(p*t*r)/100;
//		System.out.println("Simple Interest is "+SI);
//	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("---SIMPLE INTERESRT---");
		System.out.println("ENTER PRINCIPAL AMOUNT");
		int p=sc.nextInt();
		System.out.println("ENTER RATE OF INTEREST");
		int r=sc.nextInt();
		System.out.println("ENTER TIME PERIOD");
		int t=sc.nextInt();
		
		P1 opr=(p1,t1,r1)->{
			int SI=(p*t*r)/100;
			System.out.println("Simple Interest is "+SI);
		};
		opr.Si(p, t, r);
		
	}
}
