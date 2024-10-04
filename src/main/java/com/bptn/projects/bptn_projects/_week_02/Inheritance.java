package com.bptn.projects.bptn_projects._week_02;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Person{
	String name;
	int age;
	
	String getName() {
		return name;
	}
	void setNmae(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
}



class Employee extends Person{
	int id;
	double salary;
	String position;
	
	Employee(int id, String name, int age, double salary, String position){
		super();
		this.id = id;
		this.position = position;
		this.name = name;
		this.age = age;
				
	}
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	double getSalary() {
		return salary;
		
	}
}
