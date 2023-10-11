package com.java8;
import java.util.*;
interface Ninterface{
	default void dell() {
		System.out.println("def");
	}
	static void hell() {
		System.out.println("hell static method");
	}
	void overri(String str);
}

public class Def implements Ninterface {
	static void hell() {
		System.out.println("hell new static method sup");
	}
	

	public static void main(String[] args)  {
		Ninterface.hell();
		Def demo = new Def();
		demo.dell();
		// TODO Auto-generated method stub
		demo.overri("overri");

	}
	public void overri(String str) {
		System.out.println(str);
	}

}
