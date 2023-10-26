package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Functionality implements Employee{
	Scanner sc= new Scanner(System.in);
	long id=1;
	@Override
	public void display(Map<Long, Emp1> al)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("\n--------------Employee List---------------\n");
		System.out.println(String.format("%-5s%-15s%-15s%-15s%-10s%-10s%-10s", "ID","First Name","Last Name","DOB","Salary","City","Gender"));
		for(Map.Entry<Long,Emp1> e : al.entrySet())
		{
			System.out.println(String.format("%-5s%-15s%-15s%-15s%-10s%-10s%-10s",e.getValue().id,e.getValue().fname,e.getValue().lname,sdf.format(e.getValue().date),e.getValue().sal,e.getValue().city,e.getValue().gender));
		}
	}
	@Override
	public void display1(Map<Long, Emp1> al) {
		
		System.out.println("\nEnter Employee ID to Display Details :");
		int id = sc.nextInt();
		
		try{
		for(Map.Entry<Long,Emp1> e : al.entrySet())
		{
			if(id == e.getValue().id)
			{
				System.out.println(e+"\n");
			}
		}
	
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}

	@Override
	public void insert(Map<Long, Emp1> al)  {
		// TODO Auto-generated method stub
		id=1;
		System.out.println("\nEnter the following details\n");
		System.out.println("Enter EMP First Name :");
		String fname = sc.next();
		System.out.println("Enter EMP Last Name :");
		String lname = sc.next();
		System.out.println("Enter EMP DOB :");
		String DOB = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
		Date date=null;
		try {
			 date = sdf.parse(DOB);
			 
			 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}  
		System.out.println("Enter EMP  Salary :");
		Double sal = sc.nextDouble();
		System.out.println("Enter EMP city :");
		String  city = sc.next();
		System.out.println("Enter EMP Gender :");
		char gender = sc.next().charAt(0);
		try {
	
		List<Character> gen=Arrays.asList('m','M','F','f'); 
		if(gen.contains(gender)) {
			al.put(id,new Emp1(id, fname, lname, date, sal, city, gender));
			id++;
			System.out.println("Added to collection");
		}
		else {
			throw new Exception();
		}
		}
		catch(Exception ex) {
			System.out.println("Caught gender Exception");
		}
		
		
	
		
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void delete(Map<Long, Emp1> al) {
		// TODO Auto-generated method stub
		System.out.println("\nEnter Employee ID to DELETE from the Databse :");
		Long id = sc.nextLong();
		int k=0;
		try{
			if(al.containsKey(id))
			{
					al.remove(id);
					System.out.println("deleted succesfully");
					k++;
			}
			else {
				System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
		}
		
		
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		
	}

	@Override
	public void update(Map<Long, Emp1> al) {
		// TODO Auto-generated method stub
		System.out.println("\nEnter the Employee ID to EDIT the details");
		Long id = sc.nextLong();
		int j=0;
		for(Map.Entry<Long,Emp1> e : al.entrySet())
		{
			if(id == e.getValue().id)
			{	
				j++;
			do{
				int ch1 =0;
				System.out.println("\nEDIT Employee Details :\n" +
									"1). First Name\n" +
									"2). Last Name" +
									"3). DOB" +
									"4). Salary\\n\n" +
									"5). City\n" +
									"6). Gender\n");
				System.out.println("Enter your choice : ");
				ch1 = sc.nextInt();
				switch(ch1)
				{
				case 1: System.out.println("Enter new Employee First Name:");
						e.getValue().fname =sc.nextLine();
						System.out.println(e+"\n");
						break;
						
				case 2: System.out.println("Enter new Employee Last Name:");
					e.getValue().lname =sc.nextLine();
					System.out.println(e+"\n");
					break;
				case 3: System.out.println("Enter new Employee DOB:");
				String DOB = sc.next();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
				try {
					Date date = sdf.parse(DOB);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				System.out.println(e+"\n");
				break;
						
				case 4: System.out.println("Enter new Employee Salary:");
					e.getValue().sal =sc.nextDouble();
					System.out.println(e+"\n");
					break;
						
				case 5: System.out.println("Enter new Employee City :");
					e.getValue().city=sc.next();
						System.out.println(e+"\n");
						break;
						
				case 6: System.out.println("Enter new Employee Gender :");
					e.getValue().gender = sc.next().charAt(0);
						System.out.println(e+"\n");
						break;
				
						
				default : System.out.println("\nEnter a correct choice from the List :");
							break;
				
				}
				}
			while(j==1);
			}
		}
		if(j == 0)
		{
			System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
		}
	
		
	}

}
