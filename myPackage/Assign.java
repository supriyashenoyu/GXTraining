package myPackage;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int items[]= {250,500,1500,1000,480};
		
		
		int cv = Arrays.stream(items).sum();
		System.out.println(cv);
		if(cv>2500) {
			cv-=(int)(cv*0.1);
		}
		else if(cv>2000) {
			cv-=(int)(cv*0.05);
		}
		System.out.println("The discounted price is "+cv);
//		HashMap<String,Integer> map = new HashMap<String,Integer>();          
//	      map.put("item1",1200);    
//	      map.put("item2",1000);    
//	      map.put("item3"
//	      		+ "",200); 
//	      map.put("item4",260); 
//	      map.put("item5",800); 
//	      map.put("item6",500); 
//	      map.put("item7",400); 
//	      map.forEach((key, value) -> System.out.println(key + " " + value));
	    System.out.println("----MENU---");  
	    System.out.println("item1-->1200");  
	    System.out.println("item1-->1200");
	    System.out.println("item1-->1200");
	    System.out.println("item1-->1200");
		Scanner sc= new Scanner(System.in);
	      
	      
	      System.out.println("Enter 5 Items");
	      int sum = 0;
	      for(int i=0;i<5;i++) {
			String need=sc.next();
	     
	      switch(need) {
	      case "item1":
	    	  sum+=1200;
	    	  break;
	      case "item2":
	    	  sum+=1000;
	    	  break;
	      case "item3":
	    	  sum+=200;
	    	  break;
	      case "item4":
	    	  sum+=260;
	    	  break;
	      case "item5":
	    	  sum+=800;
	    	  break;
	      case "item6":
	    	  sum+=500;
	    	  break;
	      case "item7":
	    	  sum+=400;
	    	  break;
	      default:
	    	  return;
	    	
	      }
			}
	      
//	        for (int value: map.values()) {
//	            sum += value;
//	        }
	        if(sum>2500) {
				sum-=(int)(sum*0.1);
			}
			else if(sum>2000) {
				sum-=(int)(sum*0.05);
			}
	 
	        System.out.println("The discounted price is "+sum); 

	}

}
