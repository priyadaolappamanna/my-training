package com.obsqura.assignment.inheritance;

public class VehicleMain {

	public static void main(String[] args) {
		Bike b=new Bike("Black",2.0,"thick");
		System.out.println(b.Print());
		Scooter s=new  Scooter("Red",2.0,"thin");
		System.out.println(s.print1());
		Bus b1=new Bus("orange",4.0,"Trasport");
		System.out.println(b1.Print());
		Jeep j=new Jeep("Green",4.0,"Covered");
		System.out.println(j.Print());
		

	}

}

class Vehicle {
	String name;
	String color;

	public Vehicle(String name, String color) {
		// super();object class is the super class of all the classes
		this.name = name;
		this.color = color;
	}

	public String Print1() {
		return "name is " + name + ", color is: " + color;

	}
}

class TwoWheeler extends Vehicle {
	private double wheels;

	public TwoWheeler(String name, String color, double wheels) {
		super(name, color);
		this.wheels = wheels;

	}

	public String print1() {
		return super.Print1() + " ,number of wheels =" + wheels;

	}
}

class Scooter extends TwoWheeler {
	private String tyre1;

	public Scooter( String color, double wheels, String tyre1) {
		super("Scooter", color, wheels);
		this.tyre1 = tyre1;
	}

	public String Printt() {
		return super.Print1()+ " tyre is :" + tyre1;
	}

}

class Bike extends TwoWheeler {
	private String tyre1;

	public Bike( String color, double wheels, String tyre1) {
		super("Bike", color, wheels);
		this.tyre1 = tyre1;
	}

	public String Print() {
		return super.print1() + "tyre is :" + tyre1;
	}

}

class FourWheeler extends Vehicle {
	private double wheels1;

	public FourWheeler(String name, String color, double wheels1) {
		super(name, color);
		this.wheels1 = wheels1;
	}

	public String Print() {

		return super.Print1() + " ,wheels are:  " + wheels1;

	}

}

class Jeep extends FourWheeler {
	private String type;

	public Jeep( String color, double wheels1, String type) {
		super("Jeep", color, wheels1);
		this.type = type;
	}

	public String Print() {
		return super.Print() + " , Type of the jeep is :" + type;
	}

}
class Bus extends FourWheeler
{
private String type1;
	public Bus( String color, double wheels1,String type1) {
		super("Bus", color, wheels1);
		this.type1=type1;
	}
	public String Print()
	{
		
		return super.Print()+" ,The type of bus is::"+type1;
	}
	
	
	}
