package myPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ja =new int[3][];
		int[] a11={1,2,3};
		int[] a22={};
		int[] a33={7,2};
		ja[0]=a11;
		ja[1]=a22;
		ja[2]=a33;
		System.out.println(Arrays.deepToString(ja));
		int as=6;
		int[] arr=(int[])Array.newInstance(int.class,as);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr));
		System.out.println("intArray[0]="+Array.get(arr, 0));
		System.out.println("Array length="+Array.getLength(arr));
	}

}
