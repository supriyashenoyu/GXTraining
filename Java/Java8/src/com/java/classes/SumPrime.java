package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P13;
import com.javaa8.interfaces.P13a;

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
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start range:");
		int n = sc.nextInt();
		System.out.println("Enter end range:");
		int m = sc.nextInt();
		P13a opr=(a)->{if(a<2) {
			return false;
		}
		for(int j=2;j<a;j++) {
			if(a%j==0) {
				return false;
			}
		}
		return true;
		};
		P13 opr1=(op,n1,m1)->{
		int sum=0;
		for(int i=n;i<=m;i++) {
			if(op.isPrime(i)) {
			System.out.print(i+",");
			sum+=i;
			
			}
			
		}
		return sum;
		};
		System.out.println();
		System.out.println("Sum of the above prime numbers is "+ opr1.SumPrime(opr, n, m));
		
		

	}

}
