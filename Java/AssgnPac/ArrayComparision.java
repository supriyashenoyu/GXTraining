package AssgnPac;

public class ArrayComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {2,5,8,0,9};
//		int[] arr1= {2,5,8,0,9};
		String [] arr= {"Mr","Mrs","Ms."};
		String [] arr1= {"Mr","Mrs","Ms."};
//		String [] arr1= {"Smith","Jones"};
		if(arr.length==arr1.length) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==arr1[i]) {
					continue;
				}
				
			}
			System.out.println("Equal");
			
		}else {
		System.out.println("NotEqual");
		}
		

	}

}
