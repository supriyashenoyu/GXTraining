package myPackage;

public class hello{
	String name;
//	public hello() {
//		name=nam;
//	}
	public void getname(String nam){
		name=nam;
		System.out.println(name);
		}
public static void main(String[] args){
	/*System.out.println("!!hello world!!");
	int a=50;
	int b=20;
	System.out.println((++a));
	System.out.println((--b));*/
	hello h= new hello();
	h.getname("sup");
	
	
}

 
}
