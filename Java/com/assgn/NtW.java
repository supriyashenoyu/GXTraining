package com.assgn;
import java.util.Scanner;

public class NtW {
static String[] units = {
"", " one ", " two ", " three ", " four ", " five ", " six ", " seven ",
" eight", " nine ", " ten ", " eleven ", " twelve ", " thirteen ", " fourteen ",
" fifteen ", " sixteen ", " seventeen ", " eighteen ", " nineteen "
};

static String[] tens = {"","", " twenty ", " thirty ",  " forty ",   " fifty ",   " sixty ",   " seventy ", " eighty ",  " ninety "   };

public static String NtW(int n) {

if (n < 20) {
return units[n];
}

if (n < 100) {
return tens[n / 10] + units[n % 10];
}

if (n < 1000) {
return units[n / 100] + " hundred and"+((n % 100 != 0) ? " " : "")+ NtW(n % 100);
}

if (n < 1000000) {
return NtW(n / 1000) + " thousand " +((n % 1000 != 0) ? " " : "")+ NtW(n % 1000);
}

if (n < 1000000000) {
return NtW(n / 1000000) + " million " +((n % 1000000 != 0) ? " " : "")+ NtW(n % 1000000);
}

return NtW
		(n / 1000000000) + " billion " +((n % 1000000000 != 0) ? " " : "") + NtW(n % 1000000000);
}

public static void main(final String[] args) {
//final Random generator = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	String s= NtW(n);
	System.out.printf(s+"Only");
	
}
}


//((n % 100 != 0) ? " " : "")