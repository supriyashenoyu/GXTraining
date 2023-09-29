package AssgnPac;
import java.io.*;
import java.util.Arrays;

public class binary {
	
	static int BS(int arr[],int n){
		int l=0;int h=arr.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(n==arr[mid]) {
				return mid;
			}
			else if(n>arr[mid]) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
			
		}
		return -11;
		
			
		
	}

	public static void main(String[] args) {
		int[] arr= {2,5,8,0,9};
		Arrays.sort(arr);
		int op=BS(arr,0);
		if(op==-1) {
			System.out.println("not there");
			
		}
		else {
			System.out.println(""
					+ "Index is "+op);
		}
		// TODO Auto-generated method stub

	}

}
