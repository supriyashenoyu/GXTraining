package myPackage;

import java.util.ArrayList;
import java.util.Collections;

public interface ComparableInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 =  new Emp(1,"a",21,30000.00);
		Emp e2 =  new Emp(2,"b",24,20000.00);
		Emp e3 =  new Emp(3,"c",23,20000.00);
		Emp e4 =  new Emp(4,"d",20,20000.00);
		ArrayList<Emp> el= new ArrayList<Emp>();
		el.add(e1);
		el.add(e2);
		el.add(e3);
		el.add(e4);
		Collections.sort(el);
		for(Emp emp :el) {
			System.out.println(emp);
		}
	}

}
