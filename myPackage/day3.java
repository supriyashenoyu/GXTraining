package myPackage;
import java.lang.reflect.Array;
import java.util.*;


public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greet = "welcome";
		char[] arr= {'a','r','r'};
		String str=new String(arr);
		System.out.println(str);
		int len=greet.length();
		System.out.println(len);
		String fs=String.format("the length of %s is %d",greet,len);
		System.out.println(fs);
		String s="9.01";
		float a=(Float.valueOf(s)).floatValue();
		System.out.println(a);
		String s1=String.valueOf(len);
		System.out.println(s1);
		char c=s.charAt(1);
		System.out.println(c);
		StringBuffer st=new StringBuffer("Welcome");
//		st.append("home");
//		st.insert(4,"suppi");
		st.replace(2, 4, "suppi");
		System.out.println(st.capacity());
		
		StringTokenizer st4 = new StringTokenizer(str);
		while(st4.hasMoreTokens()){
			System.out.println(st4.nextToken());
		}
		String myString="hello,world";
		StringTokenizer st5 = new StringTokenizer(myString,",");
		int noOfTokens;
		noOfTokens=st5.countTokens();
		System.out.println("Number of Tokens in String:"+noOfTokens);
//		
//		StringJoiner sj= new StringJoiner(":","[","[");
		
		
		String [][] names= {
				{"Mr","Mrs","Ms."},{"Smith","Jones"}
				};
		System.out.println(names[0][0]+names[1][0]);
		

		int[][] ja =new int[3][];
		int[] a11={1,2,3};
		int[] a22={1,0};
		int[] a33= {1,4,6};
		ja[0]=a11;
		ja[1]=a22;
		ja[2]=a33;
		System.out.println(Arrays.deepToString(ja));
		int as=6;
		int[] ar=(int[])Array.newInstance(int.class,as);
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(ar));
		System.out.println("intArray[0]="+Array.get(ar, 0));
		System.out.println("Array length="+Array.getLength(ar));
		
	}
}
		

				

