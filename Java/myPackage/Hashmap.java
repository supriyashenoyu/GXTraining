package myPackage;
import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 =  new Emp(1,"a",21,30000.00);
		Emp e2 =  new Emp(2,"b",24,20000.00);
		Emp e3 =  new Emp(3,"c",23,20000.00);
		Emp e4 =  new Emp(4,"d",20,20000.00);
		HashMap<Integer,Emp> hm= new HashMap<Integer,Emp>();
		hm.put(1,e1);
		hm.put(2,e2);
		hm.put(3,e3);
		hm.put(4,e4);
		System.out.println(hm);
		Set<Integer> ks =hm.keySet();
		for(Integer k:ks) {
			System.out.println(hm.get(k));
		}

	}

}
