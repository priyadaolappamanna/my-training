package com.obsqura.assignment.inheritance;

public class ShapeMain {

	public static void main(String[] args) {
		Circle c1=new Circle("Black","Circle");
		c1.setRadius(5);
		c1.prt();
		Triangle t1=new Triangle("Blue", "Triangle");
		t1.setL(3);
		t1.setB(7);
		t1.setH(12);
		t1.Print1();
	}

}
