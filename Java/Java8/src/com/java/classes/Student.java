package com.java.classes;

import java.util.Arrays;
import java.util.Scanner;

import com.javaa8.interfaces.P5;

public class Student {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student name");
		System.out.println("Enter score in subj1,subj2,subj3");
	   int[] arr=new int[3];
	   for(int i=0;i<3;i++) {
	   arr[i]=(int) sc.nextInt();
	   }
	   P5 opr=(arr1)->{
		   int s=0;
			
			for(int i=0;i<3;i++) {
				
				s+=arr[i];
				if((arr1[i])>=60){System.out.println("1st class");}
				else if(arr1[i]>=50){System.out.println("2nd class");}
				else if(arr1[i]>=35){System.out.println("pass class");}
				else{System.out.println("fail");}
			}
			int l=arr1.length;
			Arrays.sort(arr1);
			System.out.println("1st "+arr[0]);
			System.out.println("2nd "+arr[1]);
			System.out.println("Total is "+s);
			System.out.println("Avg is "+(s/l));

	   };
	   opr.Student(arr);
		

	}

}
