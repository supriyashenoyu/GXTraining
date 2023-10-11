package myPackage;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Emp1 implements Comparator<Emp1>{
	private int id;
	private String name;
	private int age;
	private double sal;




public Emp1(int id, String name, int age, double sal) {
	// TODO Auto-generated constructor stub
	this.id=id;
	this.name=name;
	this.age=age;
	this.sal=sal;
}



@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
}
public int compareTo(Emp1 o) {
	if(age==o.age) 
		return 0;
	else if(age>o.age)
		return 1;
	else
		return -1;
	
}
public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public int compare(Emp1 o1, Emp1 o2) {
		// TODO Auto-generated method stub
		if(o1.age==o2.age) 
			return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return -1;
	}
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

