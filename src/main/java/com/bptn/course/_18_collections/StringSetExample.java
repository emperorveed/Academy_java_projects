package com.bptn.course._18_collections;
import java.util.*;
import java.util.HashSet;


public class StringSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("John");
		boolean out = set.add("John");
		set.add("Mike");
		set.add("Phil");
		set.add("Luke");
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(out);
		
		Set<String>set1 = new HashSet<>(Set.of("John","Jane","Mike","Pete"));
		System.out.println(set1);
		set1.add("Nick");
		
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Jane");
		list.add("Mike");
		list.add("John");
		list.add("Pete");
		list.add("Jane");
		
		Set<String> set2 = new HashSet<>(list);
		System.out.println(set2);
		
		Set<String>set3 = new HashSet<>();
		set3.addAll(list);
		System.out.println(set3);
		
		
		System.out.println(set3.contains("Mike"));
		
		set3.remove("Mike");
		System.out.println(set3);
		
		List<String> list1 = new ArrayList<>(List.of("Ben","Steve","Cammy"));
		List<String> list2 = new ArrayList<>(List.of("Bn","Stee","Camy"));
		
		list1.addAll(list2);
		System.out.println(list1);

	}

}
