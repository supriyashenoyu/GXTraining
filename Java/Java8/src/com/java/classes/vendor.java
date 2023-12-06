package com.java.classes;

import java.util.Scanner;

import com.javaa8.interfaces.P8;

public class vendor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter hours contributed by resources");
		int r = sc.nextInt();
		
		System.out.println("Enter hours contributed by Consultants");
		int c = sc.nextInt();
		
		//In case of renting
		System.out.println("Enter hours contributed by rented resources");
		int rr = sc.nextInt();
	
	
		System.out.println("Enter hours contributed by  rented Consultants");
		int rc = sc.nextInt();
	
	
		//Commonly used/purchased s/w
		System.out.println("Enter hours contributed by  commonly used s/w liscence");
		int rs = sc.nextInt();
		
		
		
		//Infrequently used/purchased s/w
				System.out.println("Enter hours contributed by  Infrequently used s/w liscence");
				int rsi = sc.nextInt();
			
		
		P8 opr=(r1,c1,rr1,rc1,rs1,rsi1)->{
			int rdrph=50;//resource dollar rate per hr
			int cdrph=70;//consultants dollar rate per hr
			int bill=0;
			int net=bill;
			bill+=r1*rdrph;
			bill+=c1*cdrph;
			bill+=rr1*rdrph;
			net+= (int) ((rr1*rdrph)-(rr1*rdrph*0.3));
			bill+=rc*cdrph;
			net+= (int) ((rc1*cdrph)-(rc1*cdrph*0.3));
			bill+=rs*rdrph;
			net+= (int) ((rs1*rdrph)-(rs1*rdrph*0.5));
			bill+=rsi1*rdrph;
			int res=bill-net;
			return res;
		};
		int res=opr.vendor(r, rr, c, rc, rs, rsi);
		if(res>0) {
				System.out.println("net profit is "+res);}
		else {
			System.out.println("net loss is "+res);
			
		}

	}

}
