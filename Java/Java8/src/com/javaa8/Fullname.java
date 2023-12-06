package com.javaa8;
import java.util.Scanner;
import java.util.StringJoiner;
public class Fullname {
	static void fullName(String fn,String ln) {
		StringJoiner full = new StringJoiner(" ").add(fn).add(ln);
		//System.out.println(fn+""+ln);
		//System.out.println("Full name is "+full);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name");
		String fn=sc.next();
		System.out.println("Enter last name");
		String ln=sc.next();
		System.out.println(fn+" "+ln);
		
		fullName(fn,ln);
	}

}
