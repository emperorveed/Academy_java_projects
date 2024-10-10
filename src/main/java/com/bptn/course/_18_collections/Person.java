package com.bptn.course._18_collections;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	int id;
	String name;
	int age;
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString(){
		return String.format("Person [id=%s, name=%s, age=%s]", id, name, age);
		
	}

}
