package com.assgn;

import java.util.Scanner;
import java.util.Stack;

public class DtoB {
	public static void DtoB(int a) {
	    Stack<Integer> s= new Stack<Integer>();  
	    while(a!= 0)
	    {
	      int d = a % 2;
	      s.push(d);
	      a /= 2;
	    } 
	    System.out.print("Binary: ");
	    while (!(s.isEmpty()))
	    {
	      System.out.print(s.pop());
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		DtoB(n);
		

	}

}
