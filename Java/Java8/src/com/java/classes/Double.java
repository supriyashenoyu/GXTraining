package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P4;

public class Double {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("---Double---");
	System.out.println("Enter the number");
	double n=sc.nextDouble();
	P4 opr=(n1)->{int f=(int)n1;
	String s = String.valueOf(n1);
	int index = s.indexOf(".");
	System.out.println("Double Number: " + n1);
	System.out.println("Integer Part: " + f);
	return(s.substring(index+1));
	};
	System.out.println("Decimal Part: " + opr.Double(n));
	
}
}
