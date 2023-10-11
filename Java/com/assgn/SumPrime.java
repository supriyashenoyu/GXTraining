package com.assgn;

import java.util.Scanner;

public class SumPrime {
public static boolean isprime(int a) {
	if(a<2) {
		return false;
	}
	for(int j=2;j<a;j++) {
		if(a%j==0) {
			return false;
		}
	}
	return true;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start range:");
		int n = sc.nextInt();
		System.out.println("Enter end range:");
		int m = sc.nextInt();
		int sum=0;
		for(int i=n;i<=m;i++) {
			if(isprime(i)) {
			System.out.print(i+",");
			sum+=i;
			
			}
			
		}
		
		

	}

}
