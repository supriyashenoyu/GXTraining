package com.assgn;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student name");
		System.out.println("Enter score in subj1,subj2,subj3");
	   int[] arr=new int[3];;
		int s=0;
		
		for(int i=0;i<3;i++) {
			arr[i]=(int) sc.nextInt();
			s+=arr[i];
			if((arr[i])>=60){System.out.println("1st class");}
			else if(arr[i]>=50){System.out.println("2nd class");}
			else if(arr[i]>=35){System.out.println("pass class");}
			else{System.out.println("fail");}
		}
		int l=arr.length;
		Arrays.sort(arr);
		System.out.println("1st"+arr[0]);
		System.out.println("12nd"+arr[1]);
		System.out.println("Total is "+s);
		System.out.println("Avg is "+(s/l));

	}

}
