package com.java8;
interface test1{
	void func1();
	default void abc() {
		System.out.println("abc1");
		
	}
}
interface test2{
	void func2();
	default void abc() {
		System.out.println("abc2");
		
	}
}

public class Interfac implements test1,test2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfac in=new Interfac();
		in.func1();
		in.func2();
		in.abc();
	}

	public void abc() {
		// TODO Auto-generated method stub
	System.out.println("override abc");
	}
	@Override
	public void func2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
		
	}
	@Override
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("method1");
		
	}

	

}
