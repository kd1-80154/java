package com.sunbeam;

import java.util.Scanner;

abstract public class Employee {
	private String name;
	private int id;
	protected double sal;
	
	Employee()
	{
		this("",0,0);
	}
	
	Employee(String name, int id, double sal)
	{
		this.name= name;
		this.id= id;
		this.sal=sal;
	}
	
	public void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name =");
		this.name=sc.next();
		System.out.println("Enter the id =");
		this.id = sc.nextInt();
		System.out.println("Enter the sal =");
		this.sal=sc.nextDouble();
		
	}
	
	public void display()
	{
		System.out.println("name=" +this.name);
		System.out.println("id= " +this.id);
		System.out.println("sal =" +this.sal);
	}
	
	abstract public double calTotalSalary();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}	
	
	
	
	
	
	
	


