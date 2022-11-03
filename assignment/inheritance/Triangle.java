package com.obsqura.assignment.inheritance;

public class Triangle extends Shape {
	int l;
	int b;
	int h;

	

	public void setL(int l) {
		this.l = l;
	}

	public void setB(int b) {
		this.b = b;
	}

	
	public void setH(int h) {
		this.h = h;
	}

	public Triangle(String color, String name) {
		super(color, name);
		
	}
public void Print1()
{
	System.out.println(super.Print()+"The length: " +l+ "breradth is   "+b+ "and height is:   "+h);
	}
}
