package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P12;

public class Series {
	static int t1=1;
	static int t2=4;
	static int t3=7;
	static int t4;
	public static int sum(int a,int b,int c) { 
		t1=t2;
		t2=t3;
		t3=a+b+c;
		return a+b+c;
				
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = sc.nextInt();
		P12 opr=(n)->{
		System.out.println("Squares of even numbers upto "+n);
		int s=0;int i=1;
		while(s<n) {
			if(i%2==0) {
				s=i*i;
				if(s<n) {
				System.out.print
				(s+",");}
			}
			i++;	
		}
		System.out.println();
		System.out.println("///////////////////////////////////////////");
		System.out.println("Numbers upto "+n);
		for(int j=1;j<=n;j++) {
			System.out.print(j+",");
		}
		System.out.println();
		System.out.println("///////////////////////////////////////////");
		System.out.println("Series c upto "+n);
		int ser=0;
		for(int j=1;ser<=n;j++) {
			ser=(int) Math.pow(j,j);
			if(ser<n) {
			System.out.print(ser+",");}
			
		}
		System.out.println();
		System.out.println("///////////////////////////////////////////");
		System.out.println("series d");
		if(n<=t1) {
			System.out.print(t1+",");}
			else if( n<=t2 ) {System.out.print(t1+","+t2+",");}
			else {
				System.out.print(t1+","+t2+","+t3+",");
				
			}
			while(t4<n) {
			t4=sum(t1,t2,t3);
			if(t4<n) {
			System.out.print(t4+",");}
			}
			System.out.println();
			System.out.println("///////////////////////////////////////////");
			System.out.println("Squares of numbers upto "+n);
			int sq=0;
			for(int j=1;sq<=n;j++) {
				sq=j*j;
				if(sq<=n && j%4!=0)
				System.out.print(sq+",");
			}
			System.out.println();
			System.out.println("///////////////////////////////////////////");
			System.out.println("series f");
			System.out.print("1,");
			int l=1;
			for(int j=1;j<n;j++) {
				if(4*j%12!=0 ) {
				l+=(4*j);
				if(l<n)
					
				System.out.print(l+",");
				}
			}
		};
		opr.series(n1);

	}

}
