package com.obsqura.abstractpgm;

public class ShapeMain {
	public static void main(String[] args)
	{
		Shape ob=new Circle(3);//upcasting
		System.out.println("The area of circle is:  "+ob.getarea());
		System.out.println("The circumference of Circle is: "+ob.circumference());
		Shape ob1=new Rectangle(4,5);
		System.out.println("The area of Rectangle is:  "+ob1.getarea());
		System.out.println("The circumference of Circle is: "+ob1.circumference());
		Shape ob2=new Triangle(2,3,4);
		System.out.println("The area of Triangle is:  "+ob2.getarea());
		System.out.println("The circumference of Circle is: "+ob2.circumference());
		
		
		
	}
	

}
