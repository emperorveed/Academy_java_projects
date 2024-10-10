package com.bptn.course._07_iterator;
import java.util.*;
import java.util.Iterator;
public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(7);
		numbers.add(9);
		numbers.add(4);
		numbers.add(2);
		
		Iterator<Integer> it = numbers.iterator();
		
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			if(i <4) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
