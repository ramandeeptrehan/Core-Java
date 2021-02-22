package com.learning.four.objectsAndClasses;

import java.time.LocalDate;

//This program demonstrates parameter passing in Java
public class ParamTest {

	public static void main(String[] args) {
		
		/*
		 * Test 1: methods can't modify numeric parameters
		 */
		
		System.out.println("Testing triple value");
		double percent = 10;
		System.out.println("Before: percent = " + percent);
		tripleValue(percent);
		System.out.println("After: percent = " + percent);
		
	    /*
	     * Test 2: methods can change the state of object parameters
	     */
		Employee harry = new Employee("Harry", 100000, LocalDate.of(1987, 12, 27));
		System.out.println("Before: salary = " + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary = " + harry.getSalary());
		
		/*
		 * Test 3: Methods can't attach new objects to object parameters.
		 * Proof of: in Java, objects are passed by value
		 */
		System.out.println("Testing swap");
		Employee a = new Employee("Harry", 100000, LocalDate.of(1976, 12, 28));
		Employee b = new Employee("Berry", 120000, LocalDate.of(1987, 12, 27));
		System.out.println("Before: a = " + a.getName() + " b = " + b.getName());
		swap(a, b);
		System.out.println("After: a = " + a.getName() + " b = " + b.getName());
	}
	
	public static void tripleValue(double x) {
		x = 3 * x;
		System.out.println("End of method: x = " + x);
	}
	
	public static void tripleSalary(Employee employee) {
		employee.setSalary(employee.getSalary() * 3);
	}
	
	public static void swap(Employee x, Employee y) {
		Employee temp = x;
		x = y;
		y = temp;
		
		System.out.println("End of method: x = " + x.getName() + " y = " + y.getName());
	}

}
