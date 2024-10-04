package com.bptn.course._06_oop;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String position;
	
	

	Employee(int id, String name, double salary, String position) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
	}
	
	double calculateBonus(double percentage) {
		double bonus = salary * percentage;
		return bonus;
	}
}
