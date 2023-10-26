package Practice;


public class Rice {
	public static boolean isPossible(int max, int min , int g) throws Exception{
		boolean res = false;
		if(max*5+min>=g) {
			res=true;
			int res1=g/5;
			System.out.println("No. of max kg bags needed "+res1);
			int rem=g%5;
			System.out.println("No. of min kg bags needed "+rem);
			
		}
		else {
			System.out.println("Not Possible");
		}
		return res;
	 
	}


public static void main(String[] args) throws Exception {
	System.out.println(isPossible(5,1,2));

	
}
}

