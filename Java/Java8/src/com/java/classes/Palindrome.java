package com.java.classes;

import com.javaa8.interfaces.P20;

public class Palindrome {

	public static void main(String[] args) {
		P20 opr=()->{
		String str = "madam";
		  StringBuilder sb = new StringBuilder();
	       sb.append(str);
	       sb.reverse();
	       if(str.equals(sb))
	       {
	    	   System.out.println("String is a Palindrome");
	       }
	       else {
	    	   System.out.println("String is not a Palindrome");
	       }
		};
		opr.Palindrome();

	      

	        

	}

}
