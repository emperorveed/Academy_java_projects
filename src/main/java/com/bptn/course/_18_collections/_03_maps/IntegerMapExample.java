package com.bptn.course._18_collections._03_maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IntegerMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(3,  "Mike");
		map.put(4,  "Lucy");
		map.put(5,  "Mary");
		map.put(6,  "John");
		map.put(7,  "Jane");
		map.put(8,  "Elle");
		
		map.put(5, "Jerry"); //Replaces the key value entry
		map.put(1, "Jane");
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get(7));
		System.out.println(map.get(15));
		map.replace(3, "King");
		
		map.remove(1);
		System.out.println(map);
		
//		for(Integer key: map.keySet()) {
//			System.out.println(key + ": " + map.get(key));
//		}
		
		//for each loop
		
//		for(Map.Entry<Integer,String> entry: map.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
//		
//		map.forEach((k,v) -> System.out.println(k + ": " + v)) ;
		
		// Iterator
		
		Iterator<Entry<Integer, String>> ite = map.entrySet().iterator();
		while(ite.hasNext()) {
			Entry<Integer, String> entry = ite.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		
		}

}
