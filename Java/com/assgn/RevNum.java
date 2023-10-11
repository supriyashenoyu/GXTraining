package com.assgn;

import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int r = 0;int t;
		while(n!=0) {
			t=n%10;
			r=(r*10)+t;
			n/=10;
				
		}
		System.out.println("reverse is "+r);

	}

}
