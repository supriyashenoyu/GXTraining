package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stu {

	String name;
	int rollNo;
	String section;
	int cat;
	
	public Stu(String name, int rollNo, String section, int cat) {
		this.name = name;
		this.rollNo = rollNo;
		this.section = section;
		this.cat = cat;
	}
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
	 //
	 public static boolean isValidSection(String name) 
	    { 
	   
	        String regex = "^[1-8][A-Ca-c]$";
	        Pattern p = Pattern.compile(regex); 
	        if (name == null) { 
	            return false; 
	        } 
	        Matcher m = p.matcher(name); 
	        return m.matches(); 
	    }
	public static void main(String[] args) {
		String name=null;
		int rollNo=0;
		String section=null;
		int cat=0;
		int route=0;
		int roomNo;
		List<DayScholars> Arr= new ArrayList<DayScholars>();
		Scanner sc= new Scanner(System.in);
		String in;
		do{
			 System.out.println("Enter name");
			 name=sc.next();
			 if(isValidName(name)){
				 System.out.println("valid");
			 }
			 else{
				 System.out.println("Invalid name");
				 return;
			 }
			 System.out.println("Enter Roll no");
			 if(sc.hasNextInt()){
				rollNo=sc.nextInt();
			 }
			 else{
				 System.out.println("Invalid Roll no");
			 }
			 System.out.println("Enter section");
			 section=sc.next();
			 if(isValidSection(section)){
				 System.out.println("valid");
				  
				
			 }
			 else{
				 System.out.println("Invalid section");
				return;
			 }
			
			System.out.println("Enter student category(1)Day Scholar	2)Hosteller");
			 if(sc.hasNextInt()){
			 cat=sc.nextInt();
			 }
			if(cat==1) {
				System.out.println("Enter bus route from 1-3");
				route=sc.nextInt();
				DayScholars s1= new DayScholars(name,rollNo,section,cat,route);
				Arr.add(s1);
			}
			if(cat==2) {
				System.out.println("Enter room no");
				if(sc.hasNextInt()&& sc.nextInt()<=25)
				roomNo=sc.nextInt();
				Stu s2= new Hostellers(name,rollNo,section,cat,route);
			}
			System.out.println("Do you want to enter students details?");
			in=sc.next();	
		}while(in.equals("yes"));
		
		System.out.println("Enter Student roll no and section");
		int roll=sc.nextInt();
		String sec=sc.next();
		for (Stu s : Arr)
		    if (s.cat==1)
		    {
		    	for(DayScholars d1:Arr) {
		    	if(roll==d1.rollNo) {
		    	int s1=d1.route;
		    	System.out.println(s1);
		    	Bus b=new Bus();
		    	b.m1(s1);
		    	}
		    	
		    	}
		    }
		      
		
		
		
	}

}
