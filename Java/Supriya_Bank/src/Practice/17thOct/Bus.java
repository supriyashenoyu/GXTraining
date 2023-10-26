package Practice;

public class Bus {
	public static void m1(int route) { 
	String busname=null;
	int time=0;

	switch(route) {
	case 1 :
		busname="bus-1";
		time=1;
		break;
	case 2 :
		busname="bus-2";
		time=2;
		break;
	case 3 :
		busname="bus-3";
		time=3;
		break;
	}
	System.out.println("Bus name is "+busname);
	System.out.println("Travel time is "+time);
	}

}
