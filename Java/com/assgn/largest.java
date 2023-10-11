package com.assgn;

import java.util.Arrays;
import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		 int[] arr=new int[3];
			for(int i=0;i<=2;i++) {arr[i]=(int) sc.nextInt();}
			Arrays.sort(arr);
			System.out.println("largest "+arr[0]);
			System.out.println("Second largest "+arr[1]);

	}

}
