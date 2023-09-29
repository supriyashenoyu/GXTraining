package AssgnPac;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"mango","apple","banana","mango","orange"};
		Set uniqueArr = new LinkedHashSet();
		for(int i=0;i<arr.length;i++){
			uniqueArr.add(arr[i]);
			
		}
		 System.out.println(uniqueArr);
		

	}
	

}

