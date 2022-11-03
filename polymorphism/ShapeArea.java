package com.obsqura.polymorphism;

public class ShapeArea {
	private double area;

	

	public double getArea()
	{
		return area;
	}

	

	public static void main(String[] args) {
		ShapeArea ob = new Triangle(2.0, 3.0, 4.0);//upcasting 
		System.out.println(ob.getArea());

	}

}

class Triangle extends ShapeArea {
	private double l, b, h;

	public Triangle(double l, double b, double h) {
		//super(l * b * h);
		this.l = l;
		this.b = b;
		this.h = h;
	}

	 public double getArea() {
	 return l*b*h;
	 }

}
