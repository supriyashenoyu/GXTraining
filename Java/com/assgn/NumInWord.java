package com.assgn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = sc.next();
		List<String> li = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
		char[] arr = s.toCharArray();
		for (char c : arr) {
			if (li.contains(String.valueOf(c))) {
				
				System.out.print(c);
			}
		}

	}

}
