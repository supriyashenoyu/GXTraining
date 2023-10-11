package com.assgn;

import java.util.Scanner;

public class Fact {
	public static int fact(int a) {
		if(a==1 || a==0) {
			return 1;
		}
		else {
		return a*fact(a-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		if(n<0) {
			System.out.println("Factorial of negative number not possible");
		}
		System.out.println(fact(n));
		
		

	}

}
