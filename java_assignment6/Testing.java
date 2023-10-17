package com.sunbeam;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter xcordinate=");
	  double x=s.nextDouble();
	  System.out.println("enter y cordinate=");
	  double y=s.nextDouble();
	  System.out.println("enter diamter=");
	  double diameter=s.nextDouble();
	  Circle c1=new Circle(x,y,diameter);
	  System.out.println(c1);
	  s.close();

	}

}
