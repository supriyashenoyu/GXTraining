package com.galaxe.bank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EMPassign {
	 public static boolean isValidName(String name) 
	    { 
	   
	        String regex = "^[A-Za-z]\\w{5,29}$";
	        Pattern p = Pattern.compile(regex); 
	        if (name == null) { 
	            return false; 
	        } 
	        Matcher m = p.matcher(name); 
	        return m.matches(); 
	    } 
	 
	 public static boolean isValidEmail(String email) 
	    { 
	   
	        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	        Pattern p = Pattern.compile(regex); 
	        if (email == null) { 
	            return false; 
	        } 
	        Matcher m = p.matcher(email); 
	        return m.matches(); 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		 long Empid;
		 String email;
		 float sal;
		 System.out.println("Enter name");
		 String temp=sc.next();
		 if(isValidName(temp)){
			 name=temp;
			 System.out.println("valid");
		 }
		 else{
			 System.out.println("Invalid name");
			 return;
		 }
		 System.out.println("Enter EmpId");
		 if(sc.hasNextLong()){
			 Empid=sc.nextLong();
			
		 }
		 else{
			 System.out.println("Invalid Input");
			 return;
		 }
		 System.out.println("Enter Email");
		 temp=sc.next();
		 
		 if(isValidEmail(temp)){
			 email=temp;
			
		 }
		 else{
			 System.out.println("Invalid email");
			 return;
		 }
		 System.out.println("Enter Salary");
		 if(sc.hasNextFloat()){
			 sal=sc.nextFloat();
			
		 }
		 else{
			 System.out.println("Invalid Salary");
			 return;
		 }
			System.out.println("Employee Details");
			System.out.println("emp id is "+Empid+", emp name is "+name+", and mail Id is "+email+", having salaray "+sal);

	}

	

}
