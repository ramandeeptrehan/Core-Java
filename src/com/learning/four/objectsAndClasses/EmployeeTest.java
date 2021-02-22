package com.learning.four.objectsAndClasses;

import java.time.LocalDate;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Carl", 75000, LocalDate.of(1987, 12, 15));
		staff[1] = new Employee("Max", 85000, LocalDate.of(1989, 12, 19));
		staff[2] = new Employee("Kevin", 65000, LocalDate.of(1992, 06, 24));
		
		//raise everyone's salary by 5% and setId
		for(Employee employee: staff) {
			employee.raiseSalary(5);
		}
		
		for(Employee employee: staff) {
			System.out.println(employee);
		}
	}
}
