package Practice;

public class DayScholars extends Stu{
	int route;

	public DayScholars(String name, int rollNo, String section, int cat,int route) {
		super(name, rollNo, section, cat);
		this.route=route;
		
	}

	@Override
	public String toString() {
		return "DayScholars [route=" + route + ", name=" + name + ", rollNo=" + rollNo + ", section=" + section
				+ ", cat=" + cat + "]";
	}
	

}
