package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee
{
	private double comm;
	
	public Salesman()
	{
	}
	
	public Salesman(String name, int id, double sal, double bonus, double comm)
	{
		super(name, id, sal);
	}
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter the commission of Salesman = ");
		this.comm = new Scanner(System.in).nextDouble();
	}
	
	public void display()
	{
		//System.out.println("Total Salary of Salesman = " +(this.sal ));
		super.display();
		System.out.println("Salesman Total Salary= " + (this.sal + this.sal*this.comm/100));
	}
	
	

	@Override
	public double calTotalSalary() {
		return this.getSal() + this.comm;
		
	}

	public double getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}
	

	@Override
	public String toString() {
		return "Salesman [comm=" + comm + "]";
	}
	
	

}
