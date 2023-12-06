package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P10;




public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		P10 opr=(n1)->{
			int r = 0;int t;
			
			while(n1!=0) {
				t=n%10;
				r=(r*10)+t;
				n1/=10;
					
			}
			return r;
		};
		
		System.out.println("reverse is "+opr.revNum(n));
		

	}

}
