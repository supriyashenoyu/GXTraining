package com.assgn;

import java.util.Scanner;

public class OE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("---Odd or Even---");
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%2==0) {System.out.println(n+" is a even number");}
		else {
			System.out.println(n+" is a odd number");
		}

	}

}
