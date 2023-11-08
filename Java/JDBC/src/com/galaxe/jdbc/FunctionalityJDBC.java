package com.galaxe.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import java.util.Scanner;

public class FunctionalityJDBC implements Employee {
	Scanner sc = new Scanner(System.in);
	long id ;

	
	Connection connection=null;
	PreparedStatement ps=null;

	@Override
	public void display() {
		try {
			

			// Create Statement
			Statement statement = DBConn.getStatm();

			// Execute Queries
			ResultSet rs = statement.executeQuery("select * from EMP");

			System.out.println("\n------------------------Employee List------------------------\n");
			System.out.println(String.format("%-5s%-15s%-15s%-15s%-10s%-10s%-10s", "ID", "First Name", "Last Name",
					"DOB", "Salary", "City", "Gender"));
			while (rs.next()) {
				Long id = rs.getLong(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				Date date = rs.getDate(4);
				Float sal = rs.getFloat(5);
				String city = rs.getString(6);
				Character gender = rs.getString(7).charAt(0);
				System.out.println(
						String.format("%-5s%-15s%-15s%-15s%-10s%-10s%-10s", id, fname, lname, date, sal, city, gender));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DBConn.closeConn(DBConn.getConn());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void display1() {
		try {
			connection=DBConn.getConn();
			// Execute Queries
			System.out.println("Enter Employee ID to display details");
			Long id = sc.nextLong();
			String sql = "SELECT * FROM EMP WHERE id=?";
			ps = connection.prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("\n------------------------Employee List------------------------\n");
				System.out.println(String.format("%-5s%-15s%-15s%-15s%-10s%-10s%-10s", "ID", "First Name", "Last Name",
						"DOB", "Salary", "City", "Gender"));
				System.out.println(String.format("%-5s%-15s%-15s%-15s%-10s%-10s%-10s", rs.getLong(1), rs.getString(2),
						rs.getString(3), rs.getDate(4), rs.getFloat(5), rs.getString(6), rs.getString(7).charAt(0)));
			} else {
				System.out.println("no records");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DBConn.closeConn(DBConn.getConn());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub

		System.out.println("\nEnter the following details\n");
		System.out.println("Enter EMP First Name :");
		String fname = sc.next();
		System.out.println("Enter EMP Last Name :");
		String lname = sc.next();
		System.out.println("Enter EMP DOB :");
		String DOB = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = sdf.parse(DOB);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		System.out.println("Enter EMP  Salary :");
		Float sal = sc.nextFloat();
		System.out.println("Enter EMP city :");
		String city = sc.next();
		System.out.println("Enter EMP Gender :");
		Character gender = sc.next().charAt(0);
		try {
			connection=DBConn.getConn();
			// Create Statement

			List<Character> gen = Arrays.asList('m', 'M', 'F', 'f');
			boolean g;
			try {
				 g=gen.contains(gender);
				 }
			catch (Exception ex) {
					System.out.println("Caught gender Exception");
					return;
				
			}
			if (g) {
				String sql = "insert into  EMP(fname,lname,DOB,sal,city,gender) values(?,?,?,?,?,?)";
				ps = connection.prepareStatement(sql);
			
				ps.setString(1, fname);
				ps.setString(2, lname);
				ps.setDate(3, new java.sql.Date(date.getTime()));
				ps.setFloat(4, sal);
				ps.setString(5, city);
				ps.setString(6, gender.toString());
				ps.executeUpdate();
			
				System.out.println("Added to collection");
			} 	
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		try {
			DBConn.closeConn(DBConn.getConn());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		try {
			connection=DBConn.getConn();

			// Execute Queries
			System.out.println("Enter Employee ID to delete ");
			Long id = sc.nextLong();
			String sql = "DELETE FROM EMP WHERE id=?";
			ps = connection.prepareStatement(sql);
			ps.setLong(1, id);
			ps.execute();
			display();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DBConn.closeConn(DBConn.getConn());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		try {
			connection=DBConn.getConn();
			// Execute Queries
			System.out.println("Enter Employee ID to Update details");
			Long id = sc.nextLong();

			String sql = "SELECT * FROM EMP WHERE id=?";
			ps = connection.prepareStatement(sql);
			ps.setLong(1, id);
			int j = 0;
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				j++;
				do {
					int ch1 = 0;
					System.out.println("\nEDIT Employee Details :\n" + "1). First Name\n" + "2). Last Name\n"
							+ "3). DOB\n" + "4). Salary\n" + "5). City\n" + "6). Gender\n" + "7). Exit\n");
					System.out.println("Enter your choice : ");
					ch1 = sc.nextInt();
					switch (ch1) {
					case 1:
						System.out.println("Enter new Employee First Name:");
						String fname = sc.next();
						String sql1 = "UPDATE EMP SET fname=? where id=?";
						ps = connection.prepareStatement(sql1);
						ps.setString(1, fname);
						ps.setLong(2, id);
						ps.executeUpdate();
						break;
					case 2:
						System.out.println("Enter new Employee Last Name:");
						String lname = sc.next();
						String sql2 = "UPDATE EMP SET lname=? where id=?";
						ps = connection.prepareStatement(sql2);
						ps.setString(1, lname);
						ps.setLong(2, id);
						ps.executeUpdate();
						break;
					case 3:
						System.out.println("Enter new Employee DOB:");
						String DOB = sc.next();
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						Date date = null;
						try {
							date = sdf.parse(DOB);
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						String sql3 = "UPDATE EMP SET DOB=? where id=?";
						ps = connection.prepareStatement(sql3);

						ps.setDate(1, new java.sql.Date(date.getTime()));
						ps.setLong(2, id);
						ps.executeUpdate();

						break;

					case 4:
						System.out.println("Enter new Employee Salary:");
						Float sal = sc.nextFloat();
						String sql4 = "UPDATE EMP SET sal=? where id=?";
						ps = connection.prepareStatement(sql4);
						ps.setFloat(1, sal);
						ps.setLong(2, id);
						ps.executeUpdate();
						break;

					case 5:
						System.out.println("Enter new Employee City :");
						String city = sc.next();
						String sql5 = "UPDATE EMP SET city=? where id=?";
						ps = connection.prepareStatement(sql5);
						ps.setString(1, city);
						ps.setLong(2, id);
						ps.executeUpdate();
						break;

					case 6:
						System.out.println("Enter new Employee Gender :");
						Character gender = sc.next().charAt(0);
						String sql6 = "UPDATE EMP SET gender=? where id=?";
						ps = connection.prepareStatement(sql6);
						ps.setString(1, gender.toString());
						ps.setLong(2, id);
						ps.executeUpdate();

						break;
					case 7:
						return;

					default:
						System.out.println("\nEnter a correct choice from the List :");
						break;

					}

				} while (j == 1);
			}
			if (j == 0) {
				System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Updated..");
				DBConn.closeConn(DBConn.getConn());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
