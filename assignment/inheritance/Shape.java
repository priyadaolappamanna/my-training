package com.obsqura.assignment.inheritance;
//super class
public class Shape 
{
	String color;
	String name;
	public Shape(String color, String name)
	{
		this.color=color;
		this.name =name;
	}
	public String Print()
	{
		return "name is "+name+ " Colour is :   "+color ;
	}

}
