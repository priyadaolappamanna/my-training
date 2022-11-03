package com.obsqura.assignment.inheritance;

public class Circle extends Shape {
	int radius;

	public Circle(String color, String name) {
		super(color, name);
		
	}

	//public int getRadius() {
		//return radius;
	//}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void prt()
	{
		System.out.println(super.Print()+" the radius is "+radius);
		}

}
