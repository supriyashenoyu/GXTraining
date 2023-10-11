package com.assgn;

import java.util.Scanner;

public class Tax {
	static int tp; 
	public static int anet(int gsal) {
		if(gsal<250000) {
			tp=0;
			return gsal;
		}
		if(gsal>=250000&&gsal<500000) {
			tp=(gsal*5)/100;
			return gsal-=(gsal*5)/100;
		}
		if(gsal>=500000&&gsal<1000000) {
			tp=(gsal*2)/10;
			return gsal-=(gsal*2)/10;
		}
		else {
			tp=(gsal*3)/10;
			return gsal-=(gsal*3)/10;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Employee ID");
		int empid = sc.nextInt();
		System.out.println("Enter basic");
		int basic = sc.nextInt();
		System.out.println("Enter special allowances");
		int sa = sc.nextInt();
		System.out.println("Enter percentage of bonus");
		int bonus = sc.nextInt();
		System.out.println("Enter monthly tax saving investment");
		int saving = sc.nextInt();
		int gsal=basic+sa-saving+((basic*bonus)/100);
		int anet=anet(gsal);
		System.out.println("Annual gross salary "+gsal);
		System.out.println("Annual net salary "+anet);
		System.out.println("Tax payable "+tp);
		

	}

}
