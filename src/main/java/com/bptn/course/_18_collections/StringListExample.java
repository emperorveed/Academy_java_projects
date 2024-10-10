package com.bptn.course._18_collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StringListExample {

	public static void main(String[] args) {
		
		// ArrayList<String> list = new ArrayList<String>();
		// ArrayList<String> list = new ArrayList<>();
		
		
		List<String> list = new ArrayList<>();
		// Also uses index
		list.add("John");
		list.add("Mike");
		list.add("Vick");
		list.add("John");
		list.add("Pete");
		list.add("Jane");
		
		List<String> list2 = new ArrayList<>(List.of("Veed", "Femi", "Weller"));
		
		List<Integer> list3 = new ArrayList<>();
		
		System.out.println("List 2: " + list2);
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(3));
		// insert element
		list.add(3, "Nick");
		System.out.println(list);
		//Replace element
		list.set(2, "Joe");
		System.out.println(list);
		//Remove element
		list.remove("John");
		System.out.println(list);
		
		/*
		 * Classic for-loop / C for-loop / Traditional for-loop
		 */
		
		for (int i = 0; i<list.size(); i++) {
			//System.out.println(list.get(i));
		}
		
		/*
		 * 2. for-each loop - Enhanced for-loop
		 */
		
		for (String str : list) {
			// System.out.println(str);
		}
		
		/*
		 * 3. for-each loop - Enhanced for-loop
		 */
		// list.forEach(str -> System.out.println(str));
		
		/*
		 * 4. Iterator
		 */
		
		ListIterator<String> ite = list.listIterator();
		while (ite.hasNext()) {
			String str = (String) ite.next();
			ite.remove();
			
		}
		System.out.println(list);
	}

}
