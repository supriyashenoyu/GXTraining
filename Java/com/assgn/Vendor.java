package com.assgn;

import java.util.Scanner;

public class Vendor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rdrph=50;//resource dollar rate per hr
		int cdrph=70;//consultants dollar rate per hr
		Scanner sc = new Scanner(System.in);
		int bill=0;
		int net=bill;
		System.out.println("Enter hours contributed by resources");
		int r = sc.nextInt();
		bill+=r*rdrph;
		System.out.println("Enter hours contributed by Consultants");
		int c = sc.nextInt();
		bill+=c*cdrph;
		//In case of renting
		System.out.println("Enter hours contributed by rented resources");
		int rr = sc.nextInt();
		bill+=rr*rdrph;
		net+= (int) ((rr*rdrph)-(rr*rdrph*0.3));
		System.out.println("Enter hours contributed by  rented Consultants");
		int rc = sc.nextInt();
		bill+=rc*cdrph;
		net+= (int) ((rc*cdrph)-(rc*cdrph*0.3));
		//Commonly used/purchased s/w
		System.out.println("Enter hours contributed by  commonly used s/w liscence");
		int rs = sc.nextInt();
		bill+=rs*rdrph;
		net+= (int) ((rs*rdrph)-(rs*rdrph*0.5));
		//Infrequently used/purchased s/w
				System.out.println("Enter hours contributed by  Infrequently used s/w liscence");
				int rsi = sc.nextInt();
				bill+=rsi*rdrph;
		int res=bill-net;
		if(res>0) {
				System.out.println("net profit is "+res);}
		else {
			System.out.println("net loss is "+res);
			
		}
	}

}
