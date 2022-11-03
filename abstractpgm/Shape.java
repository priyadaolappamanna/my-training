package com.obsqura.abstractpgm;

public abstract class Shape {
	
	public abstract double getarea();
	public abstract double circumference();
	

}
 class Circle extends Shape{
	
	
	private double radius;
    private final double PIE=3.14;
	public Circle(double radius) {
		//super();
		this.radius = radius;
	}
	
	public double getarea()
	{
		
		return PIE*radius*radius;
		
	}
	public double circumference()
	{
		
		return 2*PIE*radius;
	}
}
class Rectangle extends Shape
 {
	 
	 private double l,b;

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}
	
	public double getarea()
	{
		return (l*b)/2;
		
	}
	
	 public double circumference()
	 {
		 return 2*(l+b);
	 }
 }
class Triangle extends Shape
{
	private double l,b,h;

	public Triangle(double l, double b, double h) {
		super();
		this.l = l;
		this.b = b;
		this.h = h;
	}
	public double getarea()
	{
		
		return l*b*h;
	}
	public double circumference()
	{
		
		return (l+b+h);
	}
}
