package AssgnPac;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		  StringBuilder sb = new StringBuilder();
	       sb.append(str);
	       sb.reverse();
	       if(str.equals(sb))
	       {
	    	   System.out.println("String is a Palindrome");
	       }
	       else {
	    	   System.out.println("String is not a Palindrome");
	       }

	      

	        

	}

}
