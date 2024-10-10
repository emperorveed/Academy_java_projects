package com.bptn.course._18_collections;

import java.util.ArrayList;
import java.util.List;

public class PersonListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons = new ArrayList<>();
		
		//Person p new Person(1, "John", 30);
		persons.add(new Person(1,"John",30));
		persons.add(new Person(2,"Steve",33));
		persons.add(new Person(3,"Jane",27));
		persons.add(new Person(1,"John",30));
		persons.add(new Person(4,"Vick",34));
		
		System.out.println(persons.size());
		
		System.out.println(persons.get(2));
		persons.add(3, new Person(5,"Femi",29));
		persons.set(3, new Person(5,"Dave", 29));
		
		System.out.println(persons);
		System.out.println(persons.size());
		
		persons.remove(new Person(3,"Jane",27));
		
		System.out.println(persons);
		System.out.println(persons.size());
	}

}
