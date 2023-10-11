package myPackage;

public class StackOverf {

	public static void main(String[] args) {
		
		StackOverf so= new StackOverf();
		so.m1();
	}
		// TODO Auto-generated method stub
		public void m1(){
			System.out.println("Inside m1");
			m2();
			
		}
		public void m2(){
			System.out.println("Inside m2");
			m1();
			
		}

	

}
