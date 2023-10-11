package com.assgn;

import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("---Double---");
		System.out.println("Enter the number");
		double n=sc.nextDouble();
		int f=(int)n;
	String s = String.valueOf(n);
	int index = s.indexOf(".");
	System.out.println("Double Number: " + n);
	System.out.println("Integer Part: " + f);
	System.out.println("Decimal Part: " + s.substring(index+1));

	}

}

