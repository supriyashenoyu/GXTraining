package AssgnPac;

import java.util.*;

abstract class Questions {
	Scanner scc = new Scanner(System.in);

	abstract void questions(int top, int cat, String ques);

}

class Java extends Questions {
	void questions(int top, int cat, String ques) {
		List<String> java1 = new ArrayList<String>();
		List<String> java2 = new ArrayList<String>();
		if (cat == 1) {
			java1.add(ques);
			System.out.println("Enter 4 options");
			Map<Integer, String> hs = new HashMap<Integer, String>();
			for (int i = 1; i <= 4; i++) {
				String opt = scc.nextLine();
				hs.put(i, opt);
			}
			if (!java1.isEmpty()) {
				System.out.println("Java Questions");
				for (String s : java1)
					System.out.println(s);
				 for (Map.Entry<Integer, String> entry : hs.entrySet()) {
				      System.out.println(entry.getKey() + ": " + entry.getValue());
				    }
				
			}

		}

		if (cat == 2) {
			java2.add(ques);
			if (!java2.isEmpty()) {
				System.out.println("Java Questions");
				for (String s : java2)
					System.out.println(s);
			}
		}
		
		
		
		
	}
}

class Sql extends Questions {
	void questions(int top, int cat, String ques) {
		List<String> sql1 = new ArrayList<String>();
		List<String> sql2 = new ArrayList<String>();
		if (cat == 1) {
			sql1.add(ques);
		}
		if (cat == 2) {
			sql2.add(ques);
		}
		if (!sql1.isEmpty()) {
			for (String s : sql1)
				System.out.println(s);
		}
		if (!sql2.isEmpty()) {
			for (String s : sql2)
				System.out.println(s);
		}
	}
}

class Apti extends Questions {
	void questions(int top, int cat, String ques) {
		List<String> apti1 = new ArrayList<String>();
		List<String> apti2 = new ArrayList<String>();
		if (cat == 1) {
			apti1.add(ques);
		}
		if (cat == 2) {
			apti2.add(ques);
		}
		if (!apti1.isEmpty()) {
			for (String s : apti1)
				System.out.println(s);
		}
		if (!apti2.isEmpty()) {
			for (String s : apti2)
				System.out.println(s);
		}
	}
}

class DS extends Questions {
	void questions(int top, int cat, String ques) {
		List<String> ds1 = new ArrayList<String>();
		List<String> ds2 = new ArrayList<String>();
		if (cat == 1) {
			ds1.add(ques);
		}
		if (cat == 2) {
			ds2.add(ques);
		}
		if (!ds1.isEmpty()) {
			for (String s : ds1)
				System.out.println(s);
		}
		if (!ds2.isEmpty()) {
			for (String s : ds2)
				System.out.println(s);
		}
	}
}

public class Portal2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner scc = new Scanner(System.in);
		List<String> qu = new ArrayList<String>();
		System.out.println("Enter no of questions");
		int q=sc.nextInt();
		Java j = new Java();
		Sql s = new Sql();
		Apti a = new Apti();
		DS d = new DS();
		for(int i=0;i<q;i++) {
		System.out.println("Enter number of the  topic from the list " + "---TOPICS---"
				+ "1)Java 2)Sql 3)Aptitude 4)Data Structures");
		int ch = sc.nextInt();
		System.out.println("Enter number of the  category from the list " + "----Category----" + "1)MCQ 2)paragragh");
		int op = sc.nextInt();

		System.out.println("Enter the question");
		String ques = scc.nextLine();

		qu.add(ques);
		
		switch (ch) {
		case 1:
			j.questions(ch, op, ques);
			break;
		case 2:
			s.questions(ch, op, ques);
			break;
		case 3:
			a.questions(ch, op, ques);
			break;
		case 4:
			d.questions(ch, op, ques);
			break;
		}
		}
		System.out.println("Total no. of questions " + qu.size());

	}

}
