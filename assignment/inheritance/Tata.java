package com.obsqura.assignment.inheritance;

public class Tata extends Car 
{
	int price;
public Tata(String brand, String color) {
		super(brand, color);
		
	}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

public void display()
{
	System.out.println(super.print()+"price is :  " +price);
	
	}
}
