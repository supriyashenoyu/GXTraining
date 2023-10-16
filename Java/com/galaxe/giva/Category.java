package com.galaxe.giva;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Category {
	public static double pri;

	public static double Category() {
		System.out.println("Enter a category among the following");
		System.out.print("1.Ring 2.Necklace 3.Bracelet 4.Earrings");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Ring rg1 = new Ring("silver", 20000, "nickel", 5);
		Ring rg2 = new Ring("gold", 20000, "zircon", 2);
		Ring rg3 = new Ring("platinum", 20000, "nickel", 35.5);

		Necklace nk1 = new Necklace("silver", 20000, "nickel", 5);
		Necklace nk2 = new Necklace("gold", 20000, "zircon", 2);
		Necklace nk3 = new Necklace("platinum", 20000, "nickel", 35.5);

		Bracelet br1 = new Bracelet("silver", 20000, "nickel", 5);
		Bracelet br2 = new Bracelet("gold", 20000, "zircon", 2);
		Bracelet br3 = new Bracelet("platinum", 20000, "nickel", 35.5);

		Earrings er1 = new Earrings("silver", 20000, "nickel", 5);
		Earrings er2 = new Earrings("gold", 20000, "zircon", 2);
		Earrings er3 = new Earrings("platinum", 20000, "nickel", 35.5);
		if (n == 1) {
			int j = 0;
			List<Ring> r = Arrays.asList(rg1, rg2, rg3);
			for (Ring i : r) {
				System.out.println("-------------------------------");
				System.out.println("    Ring " + (++j));
				i.display();
				System.out.println("-------------------------------");
				System.out.println();
			}
			System.out.println();
			System.out.println("Enter the item number to add to wishlist");
			int on = sc.nextInt();
			System.out.println("Successfully added to wishlist");
			System.out.println("=====WISHLIST======");
			Ring p = r.get(on - 1);
			p.display();
			System.out.println("ORDER?(Yes/No)");
			String ord=sc.next();
			if(ord=="yes") {
				p.display();
				System.out.println("Total amount is "+p.price);
				pri= p.price;
			}
			else {
				Category c = new Category();
				c.Category();
				
			}

		}
		if (n == 3) {
			int j = 0;
			List<Necklace> nk = Arrays.asList(nk1, nk2, nk3);
			for (Necklace i : nk) {
				i.display();
				System.out.println();

			}
			System.out.println();
			System.out.println("Enter the item number to add to wishlist");
			int on = sc.nextInt();
			System.out.println("Successfully added to wishlist");
			System.out.println("=====WISHLIST======");
			Necklace p = nk.get(on - 1);
			p.display();
			System.out.println("ORDER?(Yes/No)");
			String ord=sc.next();
			if(ord=="yes") {
				p.display();
				System.out.println("Total amount is "+p.price);
				 pri= p.price;
			}
			else {
				Category c = new Category();
				c.Category();
				
			}

		}
		if (n == 4) {
			int j = 0;
			List<Earrings> er = Arrays.asList(er1, er2, er3);
			for (Earrings i : er) {
				System.out.println("    Earring " + (++j));
				i.display();
				System.out.println();

			}
			System.out.println();
			System.out.println("Enter the item number to add to wishlist");
			int on = sc.nextInt();
			System.out.println("Successfully added to wishlist");
			System.out.println("=====WISHLIST======");
			Earrings p = er.get(on - 1);
			p.display();
			System.out.println("ORDER?(Yes/No)");
			String ord=sc.next();
			if(ord=="yes") {
				p.display();
				System.out.println("Total amount is "+p.price);
				pri= p.price;
			}
			else {
				Category c = new Category();
				c.Category();
				
			}
		}
		if (n == 2) {
			int j = 0;
			List<Bracelet> br = Arrays.asList(br1, br2, br3);
			for (Bracelet i : br) {
				System.out.println("    Bracelet " + (++j));
				i.display();
				System.out.println();

			}
			System.out.println();
			System.out.println("Enter the items number to add to wishlist");
			int on=sc.nextInt();
			System.out.println("Successfully added to wishlist");
			System.out.println("=====WISHLIST======");
			Bracelet p =br.get(on-1);
			p.display();  
			System.out.println("ORDER?(Yes/No)");
			String ord=sc.next();
			if(ord=="yes") {
				p.display();
				System.out.println("Total amount is "+p.price);
				pri= p.price;
			}
			else {
				Category c = new Category();
				c.Category();
				
			}
			
		}
		return pri;
		
		
	}
}

