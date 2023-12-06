package com.javaa8;

import com.javaa8.interfaces.Operations;

public class DemoDay1 {
	public static void main(String[] args) {
		
		//(i,j)->i>j?i:j;
//		Operations opr=(num1,num2)->num1+num2;
//		Operations opr1=(num1,num2)->{return num1+num2;};
//		Operations opr2=(num1,num2)->num1-num2;
//		Operations opr3=(num1,num2)->num1*num2;
//		Operations opr4=(num1,num2)->num1/num2;
//		System.out.println(opr.cal(10, 20));
//		System.out.println(opr1.cal(100, 200));
//		System.out.println(opr2.cal(100, 200));
//		System.out.println(opr3.cal(100, 200));
		Operations opr=(fn,ln)->fn+" "+ln;
	}

}
