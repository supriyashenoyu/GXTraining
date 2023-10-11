package com.assgn;
/**
 * . Write a program to accept a binary number and display it in the decimal form. 
 */
import java.util.Scanner;

public class BtoD {
	public static int BtoD(int num) {
		int last=0;int decimal=0;int pow=1;
		while (num != 0)
	    {
	        last = num % 10;
	        num = num / 10;
	        decimal+= last*pow;
	        pow*=2;    
	    }
		return decimal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number:");
		int n = sc.nextInt();
		int ans=BtoD(n);
		System.out.println("Decimal number is "+ans);
	}

}
