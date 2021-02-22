package com.learning.four.objectsAndClasses;

import java.time.LocalDate;

class Employee {
	
	private static int nextId = 1;

	private String name;
	private double salary;
	private LocalDate hireDay;
	private int id;
	
	//constructor
	public Employee(String name, double salary, LocalDate hireDay) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDay = hireDay;
		this.id = nextId++;
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
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent/100;
		salary += raise;
	}

	public static int getNextId() {
		return nextId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + ", id=" + id + "]";
	}
}
