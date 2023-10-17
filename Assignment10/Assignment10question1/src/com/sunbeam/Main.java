package com.sunbeam;

public class Main 
{
	public static void main(String [] args)
	{
		Manager m = new Manager();
		m.accept();
		m.display();
		Box<Manager>b1 = new Box<>();
		b1.set(m);
		//System.out.println(" Manager Total Salary = " +b1.getTotalSalary());
	
	Salesman m1 = new Salesman();
	m1.accept();
	m1.display();
	Box<Salesman>b2 = new Box<>();
	b2.set(m1);
	//System.out.println(" Salesman Total Salary = " +b1.getTotalSalary());
	}


}
