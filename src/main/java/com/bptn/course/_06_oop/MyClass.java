package com.bptn.course._06_oop;

public class MyClass {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		
		// emp1:
		//Object of class Employee
		// instance of class Employee
		// local variable
		// 1. direct method not recommended
		Employee emp1 = null;
//		emp1.id = 2020;
//		emp1.name = "veed";
//		emp1.salary = 80_000;
//		emp1.position = "manager";
		
		 emp1.display();
		 double bonus = emp1.calculateBonus(8);
//		double total = emp1.salary + bonus;
//		
//		System.out.println(total);
		
		// 2,.. Correct way Getters and Setters
		Employee emp2 = null;
		emp2.setId(2020);
		emp2.setName("veed");
		emp2.setSalary(90_000);
		emp2.setPosition("manager");
		
		emp2.display();
		bonus = emp2.calculateBonus(10);
		
		double total = emp2.getSalary() + bonus;
		
		System.out.println(total);
		
		
		// 3. Parameterized constructor
		
		Employee emp3 = new Employee(1030,"mell",100_00,"sup");
		 emp3.display();
		 bonus = emp3.calculateBonus(7);
		 total = emp2.getSalary() + bonus;
		 System.out.println(total);
	}

}
