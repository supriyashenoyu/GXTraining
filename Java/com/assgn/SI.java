package com.assgn;

import java.util.Scanner;

public class SI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("---SIMPLE INTERESRT---");
		System.out.println("ENTER PRINCIPAL AMOUNT");
		int p=sc.nextInt();
		System.out.println("ENTER RATE OF INTEREST");
		int r=sc.nextInt();
		System.out.println("ENTER TIME PERIOD");
		int t=sc.nextInt();
		int SI=(p*t*r)/100;
		System.out.println("Simple Interest is "+SI);

	}

}
