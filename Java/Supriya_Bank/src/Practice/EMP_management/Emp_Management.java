package Practice;


import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Emp_Management {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	Menu_list m = new Menu_list();
		String fname;
		String lname;
		String DOB;
		Double sal;
		String city;
		char gender;
		Map<Long,Emp1> al = new HashMap<>();
		// TODO Auto-generated method stub
		Functionality f= new Functionality();
		
		
		int op=m.menu();
		List<Integer> list=Arrays.asList(1, 2, 3, 4, 5); 
		do{
		switch(op)
		{
		case 1:f.insert(al);
			 break;
		case 2: f.display(al);
				break;
		case 3:	f.delete(al);		
				break;
		case 4: f.update(al);
				break;
		case 5: f.display1(al);
				break;
		case 6:System.out.println("Exited...");
				break;
		default:System.out.println("Enter coreect option");
			break;
		}
	
		op=m.menu();
		
	}while(list.contains(op));
	}

	

}
