package com.obsqura.assignment.inheritance;

public class CarMain {

	public static void main(String[] args) {
		
		Tata ob=new Tata("Nexon","Red");
		ob.display();
		ob.setPrice(7);
		Ford ob1=new Ford("Ecosport", "CanyonRidge");
		ob1.print1();
		ob1.setPrice(32);
		
	}

}
