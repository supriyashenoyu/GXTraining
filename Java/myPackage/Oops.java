package myPackage;
class jewel  {
	String material;
	int price;
	public jewel(String material,int price) {
		this.price=price;
		this.material=material;		
	}
	public  void display() {
		System.out.println("Material used"+material);
		System.out.println("Total Cost"+price);	
	}
}	
class ring extends jewel {
    String stone;
	public ring(String material,int price,String stone) {
		super(material,price);
		this.stone=stone;
		System.out.println("Stone used"+stone);	
	}
	
}
public class Oops {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ring rg=new ring("silver",20000,"nickel");
		rg.display();
		
		

	}

}
