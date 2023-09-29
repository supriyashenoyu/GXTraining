package AssgnPac;
import java.util.*;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemElem {
	public static void main(String[] args) {
		String str="banana";
		String new1 = "";
		char[] ch=str.toCharArray();
		char del='n';
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=del) {
				new1+=str.charAt(i);
			}
		}
		System.out.println(new1);
		
	}

}
