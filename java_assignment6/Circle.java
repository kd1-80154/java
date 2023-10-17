package com.sunbeam;

public class Circle {
	private double xCordinate;
	private double yCordinate;
	private double diameter;

	public Circle() {
		this(0, 0, 100);
	}

	public Circle(double xCordinate, double yCordinate, double diameter) {
		super();
		this.setxCordinate(xCordinate);
		this.setyCordinate(yCordinate);
		this.setDiameter(diameter);
		this.diameter = diameter;
	}

	public double getxCordinate() {
		return xCordinate;
	}

	public void setxCordinate(double xCordinate) {
		this.xCordinate = xCordinate;
	}

	public double getyCordinate() {
		return yCordinate;
	}

	public void setyCordinate(double yCordinate) {
		this.yCordinate = yCordinate;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double Diameter)
    {
    	try {
    		if(Diameter >=0.0) {
    			this.diameter=diameter;
    		}
    		else
    		{
    			throw new DiameterIsNegativeException();
    		}
    	}
    		catch(DiameterIsNegativeException e) {
    			
    			System.out.println(e.getMessage());
    		}
    }

	@Override
	public String toString() {
		return "Circle [xCordinate=" + xCordinate + ", yCordinate=" + yCordinate + ", diameter=" + diameter + "]";
	}
}
