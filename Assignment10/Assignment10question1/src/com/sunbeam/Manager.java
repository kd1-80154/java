package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee
{
	private double bonus;
	
	Manager()
	{
		
	}
	
	public  Manager(double bonus) {
		super();
		this.bonus = bonus;
	}

	public void accept()
	{
		super.accept();
		System.out.println("Enter the bonus for Managger =");
		this.bonus= new Scanner(System.in).nextDouble();
	}
	
	public void display()
	{
		super.display();
		{
		System.out.println("Total Salary of Manager= " +(sal + this.bonus));
		//return (this.getSal() + this.bonus);
		}	
     }
	
	@Override
	public double calTotalSalary() {
		return this.sal + this.bonus;
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
	
	

}
