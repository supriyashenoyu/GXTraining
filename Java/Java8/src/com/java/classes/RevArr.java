package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P14;

public class RevArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str1=sc.next();
		//String str="Good Morning";
		P14 opr=(str)->{
		  int n = str.length()-1;
	      String rev = "", t = "";

	        for(int i = 0; i <=n; i++){
	            t += str.charAt(i);
	            if((str.charAt(i) == ' ') || (i == n)){
	                for(int j = t.length()-1; j >= 0; j--){
	                    rev += t.charAt(j);
	                    if((j == 0) && (i != n))
	                        rev += " ";
	                }
	                t = "";
	            }
	        }
	        return rev;
	
		};
		System.out.println("Reverse String is "+opr.RevArr(str1));
	}

	}


