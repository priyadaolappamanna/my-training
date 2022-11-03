package com.obsqura.assignment.inheritance;

public class Ford extends Car {//child class of parent car
public Ford(String brand, String color) {
		super(brand, color);
		// TODO Auto-generated constructor stub
	}

int price;

//public int getPrice() {
	//return price;
//}

public void setPrice(int price) {
	this.price = price;
}

public void print1()
{
	System.out.println(super.print()+"The price is :"+price);
}
}
