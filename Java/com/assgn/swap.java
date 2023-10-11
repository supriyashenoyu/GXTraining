package com.assgn;
import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("---Swapping of 2 numbers---");
		System.out.println("Enter first number");
		int fn=sc.nextInt();
		System.out.println("Enter second number");
		int sn=sc.nextInt();
		System.out.println("first number is "+fn+" and second number is "+sn);
		int t=fn;
		fn=sn;
		sn=t;
		System.out.println("After swapping");
		System.out.println("first number is "+fn+" and second number is "+sn);
		
		

	}

}
