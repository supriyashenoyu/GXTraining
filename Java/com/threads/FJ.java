package com.threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FJ extends RecursiveTask<Integer> {
	char arr[];
	int l, h;
	char letter;

	public FJ(char arr[], int l, int h, char letter) {
		this.arr = arr;
		this.l = l;
		this.h = h;
		this.letter= letter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'b','a','n','a','n','a'};
		char letter='a';
		int l=0;
		int h=arr.length-1;
		ForkJoinPool fjp = ForkJoinPool.commonPool(); 
		FJ obj= new FJ(arr,l,h,letter);
		int freq = fjp.invoke(obj);  
		System.out.println("The letter " + letter + " is found " +freq+" times");

	}
	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		int freq = 0;
		for (int j = l; j <= h; j++) {

			if (arr[j] == letter) {
				freq = freq + 1;
			}
		}

		return freq;
	}

}
