package com.javaa8;

import java.util.Scanner;

import com.javaa8.interfaces.Operations;

public class FullNames {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name");
		String fn=sc.next();
		System.out.println("Enter last name");
		String ln=sc.next();
		Operations opr=(s1,s2)->s1+" "+s2;
		System.out.println(opr.fullName(fn,ln));
	}

}
