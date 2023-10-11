package com.java8;
import java.util.*;

interface Operation{
	 int Operations(int i,int j);
	
}
public class FuncInter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(() -> System.out.println("Hello From Another Thread"));
		thread.start();
		Operation add =(i,j) -> {
			return i+j;
			
		};
		System.out.println(add.Operations(1,3));
		
		Operation sub =(i,j) -> {
			return i-j;
			
		};
		System.out.println(sub.Operations(9,3));
		Operation div =(i,j) -> {
			return i/j;
			
		};
		System.out.println(div.Operations(9,3));
		Operation mul =(i,j) -> {
			return i*j;
			
		};
		System.out.println(mul.Operations(2,4));

	}


}
