package com.java.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.javaa8.interfaces.P11;

public class NumInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word containing number:");
		String s = sc.next();
		P11 opr=(s1)->{
		List<String> li = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
		char[] arr = s1.toCharArray();
		for (char c : arr) {
			if (li.contains(String.valueOf(c))) {
				
				System.out.print(c);
			}
		}
		};
		opr.numInWords(s);

	}

}
