package myPackage;
import java.lang.*;

public class Emp implements Comparable<Emp> {
	private int id;
	private String name;
	private int age;
	private double sal;




public Emp(int id, String name, int age, double sal) {
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
@Override
public int compareTo(Emp o) {
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
}

