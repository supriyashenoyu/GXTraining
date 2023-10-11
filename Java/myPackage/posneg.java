package myPackage;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;

public class posneg {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  5 numbers");
		int a[]=new int[5];
		List<Patient> patient=new ArrayList<>();
		Patient patient1=new Patient();
		patient.setId(1);
		patient.setName("abc");
		Patient patient2=new Patient();
		patient.setId(2);
		patient.setName("xyz");
		patient.add(0,patient1);
		patient.add(0,patient1);
		for(Patient pat:patient) {
			
		}
		
		int sum=0;
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			if(a[i]>0) {
				sum+=a[i];
			}
			
		}
		System.out.print(sum);
		int num=sc.nextInt();
		if(num<0) {
			System.out.print("negative");
		}
		else {
			System.out.print("positive");
			
		}
		// TODO Auto-generated method stub

	}

}
