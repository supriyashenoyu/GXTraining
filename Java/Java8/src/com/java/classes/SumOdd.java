package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P9;

public class SumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		P9 opr=(n1)->{int sum=0;
		for(int i=1;i<=n1;i++) {if(i%2!=0) {sum+=i;}}
		return sum;};
		System.out.println("sum of odd numbers upto "+n+" is "+ opr.sumOdd(n));
		
	}
		

}
