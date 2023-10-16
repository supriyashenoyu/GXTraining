package com.galaxe.oops;

public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();//constructor should be called
		System.out.println("--Normal--");
		acc.setBname("canara");
		acc.setAccNo(2133);
		long a1=acc.getAccNo();
		String b1=acc.getBname();
		System.out.println(b1);
		System.out.println(a1);
		System.out.println("--Inheritence--");
		SalAcc sc = new SalAcc();//constructor should be called
		sc.setBname("HDFC");
		String b2=sc.getBname();
		System.out.println(b2);
		sc.setAccNo(2133);
		long a2= sc.getAccNo();
		System.out.println(a2);
		sc.Balance();
		System.out.println(sc.balance); 
		sc.getBalance();
	}

}
