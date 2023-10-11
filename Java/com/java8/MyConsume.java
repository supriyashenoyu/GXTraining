package com.java8;
import java.util.*;
import java.util.function.Consumer;


public class MyConsume {
	List<Integer> list = new ArrayList<Integer>();
	for(int i=0;i<10;i++) list.add(i);
	Iterator<Integer> iter= list.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	list.forEach(new Consumer<Integer>() {
		public void accept(Integer t) {
			System.out.println("anonymous:"+t);
		}
	});
	MyConsume action = new MyConsume();
	list.forEach(action);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> items = new HashMap<>();
		items.put("a", 10);
		items.put("b", 20);
		items.put("c", 30);
		items.put("d", 40);
		items.forEach((k,v)->System.out.println("key"+k+"===== Value:"+v));
		
		
		for(Map.Entry<String, Integer> item: items.entrySet()){
			System.out.println("key"+item.getKey() +"===== Value:"+item.getValue());
		}
		
		items.forEach((k,v)->{
			System.out.println("key" + k +"===== Value:"+v);
			IF(k.equals("E")){
				System.out.println("Hi E");
				
			}
		});
			}

}
