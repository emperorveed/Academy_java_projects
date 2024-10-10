package com.bptn.course._18_collections;
import java.util.*;
public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strs = List.of("John","Mike", "Jane", "Mike","Mary");
		
		Set<String> set = new HashSet<>(strs);
		System.out.println(set);

	}

}
