package com.galaxe.oops;

public class Transac {
	String transDate;
    String transTime;
    String kind;
    double amount;
    double balance;
    Transac(String transDate,String transTime,String kind,double amount,double balance) {
        this.transDate = transDate;
        this.transTime = transTime;        
        this.kind = kind;
        this.amount = amount;
        this.balance = balance;
      
      }

}
