package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P19;

public class NumsToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = sc.nextInt();
		P19 opr=(n)->{
		int r = 0;int t;
		while(n!=0) {
			t=n%10;
			r=(r*10)+t;
			
			n/=10;	
		}
		while(r!=0) {
		switch (r%10) {
		case 0:
			System.out.print("zero ");
			break;
		case 1:
			System.out.print("one ");
			break;
		case 2:
			System.out.println("two ");
			break;
		case 3:
			System.out.print("three ");
			break;
		case 4:
			System.out.print("four ");
			
			break;
		case 5:
			System.out.print("five ");
			break;
		case 6:
			System.out.print("six ");
			break;
		case 7:
			System.out.print("seven ");
			break;
		case 8:
			System.out.print("eight ");
			break;
		case 9:
			System.out.print("nine ");
			break;
		}
		r/=10;
		}
		};

	}

}
