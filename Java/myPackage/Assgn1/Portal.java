package AssgnPac;

import java.util.*;

public class Portal {
	static int ch;
	static int op;

	public  int questions(int op) {
		int tol1 = 0, tol2 = 0, tol3 = 0,total1=0,total2=0,total3=0,total4=0;
		Scanner sc = new Scanner(System.in);
		

			HashSet<String> hs1 = new HashSet<String>();
			hs1.add("Write a brief about Java?");
			hs1.add("Is java object oriented?");
			hs1.add("Fullform of jvm?");
			hs1.add("q4");
			tol1 = hs1.size();
			HashSet<String> hs2 = new HashSet<String>();
			hs2.add("Write a brief about Java?");
			hs2.add("Is java object oriented?");
			hs2.add("Fullform of jvm?");
			hs2.add("q4");
			tol2 = hs2.size();
			HashSet<String> hs3 = new HashSet<String>();
			hs3.add("Write a brief about Java?");
			hs3.add("Is java object oriented?");
			hs3.add("Fullform of jvm?");
			hs3.add("q4");
			tol3 = hs3.size();
			
			total1=tol1 + tol2 + tol3;
			tol1 = 0; tol2 = 0; tol3 = 0;
			
			
			HashSet<String> hs4 = new HashSet<String>();
			hs4.add("Write a brief about Java?");
			hs4.add("Is java object oriented?");
			hs4.add("Fullform of jvm?");
			hs1.add("q4");
			tol1 = hs4.size();
			HashSet<String> hs5 = new HashSet<String>();
			hs5.add("Write a brief about Java?");
			hs5.add("Is java object oriented?");
			hs5.add("Fullform of jvm?");
			hs5.add("q4");
			tol2 = hs5.size();
			HashSet<String> hs6 = new HashSet<String>();
			hs6.add("Write a brief about Java?");
			hs6.add("Is java object oriented?");
			hs6.add("Fullform of jvm?");
			hs6.add("q4");
			tol3 = hs6.size();
			
			total2=tol1 + tol2 + tol3;
			tol1 = 0; tol2 = 0; tol3 = 0;
			
			HashSet<String> hs7 = new HashSet<String>();
			hs4.add("Write a brief about Java?");
			hs4.add("Is java object oriented?");
			hs4.add("Fullform of jvm?");
			hs1.add("q4");
			tol1 = hs7.size();
			HashSet<String> hs8 = new HashSet<String>();
			hs5.add("Write a brief about Java?");
			hs5.add("Is java object oriented?");
			hs5.add("Fullform of jvm?");
			hs5.add("q4");
			tol2 = hs8.size();
			HashSet<String> hs9 = new HashSet<String>();
			hs9.add("Write a brief about Java?");
			hs9.add("Is java object oriented?");
			hs9.add("Fullform of jvm?");
			hs9.add("q4");
			tol3 = hs9.size();
			
			total3=tol1 + tol2 + tol3;
			tol1 = 0; tol2 = 0; tol3 = 0;
			
			HashSet<String> hs10 = new HashSet<String>();
			hs10.add("Write a brief about Java?");
			hs10.add("Is java object oriented?");
			hs10.add("Fullform of jvm?");
			hs10.add("q4");
			tol1 = hs10.size();
			HashSet<String> hs11 = new HashSet<String>();
			hs11.add("Write a brief about Java?");
			hs11.add("Is java object oriented?");
			hs11.add("Fullform of jvm?");
			hs11.add("q4");
			tol2 = hs11.size();
			HashSet<String> hs12 = new HashSet<String>();
			hs12.add("Write a brief about Java?");
			hs12.add("Is java object oriented?");
			hs12.add("Fullform of jvm?");
			hs12.add("q4");
			tol3 = hs12.size();
			
			total4=tol1 + tol2 + tol3;
			

			
			if (ch == 1) {
			if (op == 1) {
				System.out.println(hs1);
			}
			if (op == 2) {
				System.out.println(hs2);

			}
			if (op == 3) {
				System.out.println(hs3);
			}
		}
			if (ch == 2) {
				if (op == 1) {
					System.out.println(hs4);
				}
				if (op == 2) {
					System.out.println(hs5);

				}
				if (op == 3) {
					System.out.println(hs6);
				}
			}
			if (ch == 3) {
				if (op == 1) {
					System.out.println(hs7);
				}
				if (op == 2) {
					System.out.println(hs8);

				}
				if (op == 3) {
					System.out.println(hs9);
				}
			}
			if (ch == 4) {
				if (op == 1) {
					System.out.println(hs10);
				}
				if (op == 2) {
					System.out.println(hs11);

				}
				if (op == 3) {
					System.out.println(hs12);
				}
			}
		System.out.println("Questions from Java");
		System.out.println(hs1);
		System.out.println(hs2);
		System.out.println(hs3);
		System.out.println("Questions from Java of category one");
		System.out.println(hs1);
		
		return total1 + total2+ total3+ total4 ;
	}

	abstract class Category {
		abstract int category(int ch);
		
	}

	class Java extends Category {
		int category(int ch) {
			System.out.println("Enter number of the  category from the list " + "----Category----"
					+ "1)Intro to Java 2)Advanced Java 3)Collections in java");
			Scanner sc = new Scanner(System.in);
			op = sc.nextInt();
			return questions(op);
		}
	}
	class Sql extends Category {
		int category(int ch) {
			System.out.println("Enter number of the  category from the list " + "----Category----"
					+ "1)Intro to Sql 2)Advanced Sql 3)Complex Queries in Sql");
			Scanner sc = new Scanner(System.in);
			op = sc.nextInt();
			return questions(op);
		}
	}
	class Apti extends Category {
		int category(int ch) {
			System.out.println("Enter number of the  category from the list " + "----Category----"
					+ "1)Intro to Sql 2)Advanced Sql 3)Complex Queries in Sql");
			Scanner sc = new Scanner(System.in);
			op = sc.nextInt();
			return questions(op);
		}
	}
	class DS extends Category {
		int category(int ch) {
			System.out.println("Enter number of the  category from the list " + "----Category----"
					+ "1)Intro to Sql 2)Advanced Sql 3)Complex Queries in Sql");
			Scanner sc = new Scanner(System.in);
			op = sc.nextInt();
			return questions(op);
		}
	}

	public static void main(String[] args) {
		int total = 0;
		System.out.println("Enter number of the  topic from the list " + "---TOPICS---"
				+ "1)Java 2)Sql 3)Aptitude 4)Data Structures");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		Portal p = new Portal();
		switch(ch) {
		case 1:
			Java j = p.new Java();
		case 2:
			Sql s = p.new Sql();
		case 3:
			Apti a = p.new Apti();
		case 4:
			DS d = p.new DS();
			
		}
		total = p.new Java().category(ch);
		System.out.println("total no. of questions " + total);
	
		
		

	}
}
