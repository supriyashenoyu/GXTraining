package Practice;

import java.util.Map;
import java.util.Scanner;

public interface Employee {
	void display(Map<Long, Emp1> al);
	void display1(Map<Long, Emp1> al);
	void insert(Map<Long,Emp1> al);
	void delete(Map<Long,Emp1> al);
	void update(Map<Long,Emp1> al);

}
