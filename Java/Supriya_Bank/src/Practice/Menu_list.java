package Practice;

import java.util.Scanner;

public class Menu_list {
	
	Scanner sc= new Scanner(System.in);
	int menu() {
	System.out.println("-----Employee Management System-------");
	System.out.println("a.	Enter 1: For insert record into collection.\r\n"
			+ "b.	Enter 2: For display all records from collection\r\n"
			+ "c.	Enter 3: For Delete single the records from collection\r\n"
			+ "d.	Enter 4: For update the records from collection\r\n"
			+ "e.	Enter 5: for display one record from collection Based on ID.\r\n"
			+ "f.	Enter 6: Exit\n");
	return sc.nextInt();
	}
	
		

	
}
