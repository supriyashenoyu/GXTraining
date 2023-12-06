package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P3;

public class OE {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("---Odd or Even---");
		System.out.println("Enter the number");
		int n=sc.nextInt();
		P3 opr=(n1)->n1%2==0?" is a even number" :" is a odd number";
		System.out.println(n + opr.Oe(n));
		

	
		
	}

}
