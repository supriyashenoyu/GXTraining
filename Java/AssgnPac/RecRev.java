package AssgnPac;

public class  RecRev{
	 String rev(String str) {
		 if(str.isEmpty())  
		 {  
		 System.out.println("String is empty") ;  
		 return str;  
		 }   
		 else   
		 {  
		 return rev(str.substring(1))+str.charAt(0);  
		 }  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Supriya";
		RecRev ob = new RecRev();
		System.out.println(ob.rev(str));
		

	}

}
