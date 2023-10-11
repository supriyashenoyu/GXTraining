package myPackage;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(28);
		list.add(9);
		list.add(7);
		list.add(9);
		list.add(9);
		list.add(2);
		list.add(7);
		list.add(28);
		System.out.println(list);
		for(Integer i: list) {
			System.out.println("element::"+i);
		}
		System.out.println(list.get(0));
		System.out.println(list.contains(2));
		list.remove(1);
		//System.out.println(list.contains(list.containsAll([2,9,7])));
		Vector<String> vc = new Vector<String>();
		vc.add("apple");
		vc.add("mango");
		vc.add("orange");
		vc.add("chikku");
		System.out.println(vc);
		for(int i=0;i<vc.size();i++) {
			System.out.println(vc.get(i)+" ");
		}
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		System.out.println(ll);
		ll.add(2, 55);
		System.out.println(ll);
		 for (Iterator j = ll.iterator(); j.hasNext();) {
	         System.out.println(j.next());
	      }
		 Stack<String> s=new Stack<String>();
		 s.addAll(vc);
		 System.out.println(s);
		 System.out.println(s.peek());
		 System.out.println(s.pop());
		 s.push("banana");
		 System.out.println(s.peek());
		 System.out.println(s);
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		pq.add(2);
		pq.add(4);
		pq.add(9);
		pq.add(3);
		System.out.println(pq);
		//pq.add(null);
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
		
		HashSet<Integer> hs= new HashSet<Integer>();
		hs.add(12);
		hs.add(41);
		hs.add(97);
		hs.add(32);
		System.out.println(hs);
		hs.add(55);
		System.out.println(hs);
		hs.remove(55);
		System.out.println(hs);
		LinkedHashSet<Integer> llh = new LinkedHashSet<Integer>();
		llh.addAll(list);
		System.out.println(llh);
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.addAll(list);
		ts.add(0);
		ts.add(34);
		System.out.println(ts);
		Hashtable<String,Integer> hta = new Hashtable<String,Integer>();
		hta.put("apple",34);
		hta.put("apple",34);
		
	
		
		
		
		
		

	}

}
