package com.java.classes;

import com.javaa8.interfaces.P18;

public class Multi7 {

	public static void main(String[] args) {
		P18 opr=()->{
			int c = 0;
			int ans = 0;
			while (true) {
				ans = ans + 7;
				if (ans % 2 == 1 && ans % 3 == 1 && ans % 4 == 1 && ans % 5 == 1 && ans % 6 == 1) {
					c++;
					if (c == 1) {
						System.out.println("first multiple " + ans);
					} else if (c == 2) {
						System.out.println("second multiple " + ans);
					} else if (c == 4) {
						System.out.print("fourth multiple " + ans);
					}
				}
			}
		};
		opr.Multi7();
			
		}
		
	}


