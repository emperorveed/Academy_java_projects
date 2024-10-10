package com.bptn.course._18_collections;
import java.util.*;
public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 = Set.of("John", "Jane", "Mike");
		Set<String> set2 = Set.of("Jane", "John", "Mike","Hello");
		
		boolean equals =  set1.equals(set2);
		System.out.println(equals);
	}
	
	static boolean checkEquals(Set<String> set1, Set<String> set2) {
		for (String str: set1) {
			if(!set2.contains(str)) {
				return false;
			}
		}
		return true;
	}
	

}
