package myPackage;

public class Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,a;
		try {
			d=2;
			a=42/d;
			int c[]= {1};
			c[43]=1;
			System.out.println("this wont be printed");
		}

//catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
		catch(ArithmeticException e) {
			
			System.out.println("Divided by zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
		
			System.out.println("Array index obb:"+ e);
			e.printStackTrace();
		}
		System.out.println("After catch statement");

	}

}
