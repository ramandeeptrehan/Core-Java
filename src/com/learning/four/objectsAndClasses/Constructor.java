package com.learning.four.objectsAndClasses;

import java.util.Random;

/*
 * We can study: 
	• Overloaded constructors
	• A call to another constructor with this(...)
	• A no-argument constructor
	• An object initialization block
	• A static initialization block
	• An instance field initialization
 */
public class Constructor {
	
	public static void main(String[] args) {
		
		Emp[] staff = new Emp[3];
		staff[0] = new Emp("Harry", 40000);
		staff[1] = new Emp(60000);
		staff[2] = new Emp();
		
		for(Emp employee: staff) {
			System.out.println(employee);
		}
	}

}

class Emp {
	
	private static int nextId;
	
	private int id;
	private String name = ""; //instance field initialization
	private double salary;
	
	//static initialization block
	static {
		Random randomGenerator = new Random();
		//set nextId to random number between 1 to 9999
		nextId = randomGenerator.nextInt(10000);
	}
	
	//object initialization block
	{
		id = nextId;
		nextId++;
	}
	
	//three overloaded constructors
	public Emp(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Emp(double salary) {
		this("Employee #" + nextId, salary);
	}
	
	//default constructor
	public Emp() {
		// name initialized to ""--see above
		// salary not explicitly set--initialized to 0
		// id initialized in initialization block
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
