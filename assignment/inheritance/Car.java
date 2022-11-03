package com.obsqura.assignment.inheritance;

public class Car { //parent class
	String brand;
	String color;
	public Car(String brand, String color)
	{
		this.brand=brand;
		this.color=color;
		
	}
	public String print()
	{
		return "The brand is : "+brand + "the color is:  "+color;
	}
	

}
