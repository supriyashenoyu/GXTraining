package com.galaxe.jdbc;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Emp_Management {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Menu_list m = new Menu_list();
//		String fname;
//		String lname;
//		String DOB;
//
//		Float sal;
//		String city;
//		char gender;

		// TODO Auto-generated method stub

		FunctionalityJDBC f = new FunctionalityJDBC();

		int op = m.menu();
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		do {
			switch (op) {
			case 1:
				f.insert();
				break;
			case 2:
				f.display();
				break;
			case 3:
				f.delete();
				break;
			case 4:
				f.update();
				break;
			case 5:
				f.display1();
				break;
			case 6:
				System.out.println("Exited...");
				break;
			default:
				System.out.println("Enter correct option");
				break;
			}

			op = m.menu();

		} while (list.contains(op));
	}

}
