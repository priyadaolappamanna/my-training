package com.obsqura.assignment.inheritance;

public class FoodInheritance {
String veg;
String Nonveg;

public FoodInheritance(String veg, String nonveg) {
	super();
	this.veg = veg;
	Nonveg = nonveg;
}

@Override
public String toString() {
	return "Veg=  " + veg + ", Nonveg= " + Nonveg + " ";
}
}