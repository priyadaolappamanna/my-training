package com.obsqura.assignment.inheritance;

public class FoodVariety extends FoodInheritance  {
	public FoodVariety(String veg, String nonveg,String juice) {
		super(veg, nonveg);
		this.juice=juice;
	}
	String juice;



public String toString() {
	return super.toString()+"juice is:  "+juice;
}
}