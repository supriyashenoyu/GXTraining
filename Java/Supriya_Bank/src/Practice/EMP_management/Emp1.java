package Practice;

import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class Emp1 {
	long id;
	String fname;
	String lname;
	Date date;
	Double sal;
	String city;
	char gender;
	public Emp1() {
		// TODO Auto-generated constructor stub
	}
	public Emp1(long id, String fname, String lname, Date DOB, Double sal, String city, char gender) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.date = DOB;
		this.sal = sal;
		this.city = city;
		this.gender = gender;
	}

//	public String toString() {
//		return "Emp [id=" + id + ", fname=" + fname + ", lname=" + lname + ", DOB=" + date + ", sal=" + sal + ", city="
//				+ city + ", gender=" + gender + "]";
//	}
	


}
