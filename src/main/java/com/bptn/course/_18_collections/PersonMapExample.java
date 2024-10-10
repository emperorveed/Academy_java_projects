package com.bptn.course._18_collections;

import java.util.HashMap;
import java.util.Map;

public class PersonMapExample {

	public static void main(String[] args) {
		Map<Integer, Person> map = new HashMap<>();
		
		map.put(5,  new Person(5,"John", 30));
		map.put(11,  new Person(11,"Ben", 30));
		map.put(23,  new Person(23,"Zear", 30));
		map.put(52,  new Person(52,"Jane", 30));
		map.put(45,  new Person(45,"Mark", 30));
		
		System.out.println(map);
	}

}
