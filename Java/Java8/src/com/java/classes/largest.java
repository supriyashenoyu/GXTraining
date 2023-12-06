package com.java.classes;

import java.util.Arrays;
import java.util.Scanner;

import com.javaa8.interfaces.P6;

public class largest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		 int[] arr=new int[3];
			for(int i=0;i<=2;i++) {arr[i]=(int) sc.nextInt();}
			P6 opr=(arr1)->{
			Arrays.sort(arr);
			System.out.println("largest "+arr1[0]);
			System.out.println("Second largest "+arr1[1]);};
			opr.largest(arr);


	}

}
