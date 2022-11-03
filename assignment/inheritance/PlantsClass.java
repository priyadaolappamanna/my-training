package com.obsqura.assignment.inheritance;

//package package_new;
//plants

/*flowering        non flowering
rose and jasmin   cedar  cypress*/

public class PlantsClass {

public static void main(String[] args) {
	Plants o1 = new Plants("Plant", "Green");
	System.out.println(o1.print());
	
	Flowering o2 = new Flowering("Flowering","Red", 20);
	System.out.println(o2.print());
	
	Rose o3 = new Rose("Red", 5, true);
	System.out.println(o3.print());
	
	Jasmine o4 = new Jasmine("Red", 20, false);
	System.out.println(o4.print());
	
	NonFlowering o5 = new NonFlowering("Cedar","Red");
	o5.setNumOfNonFlowers(5);
	System.out.println(o5.print()+", Number of Cedar: "+o5.getNumOfNonFlowers());
	//System.out.println(o5.getNumOfNonFlowers());
	
	Cedar o6 = new Cedar("Blue","Non Flowering");
	o6.printCedar();
	
	Cypress o7 = new Cypress("Cypress", "Pink", "Cedar", "Non Flowering");
	o7.printCypress();
	
}

}

class Plants {
private String name;
private String color;

public Plants(String name, String color) {
	this.name = name;
	this.color = color;
}

public String print() {
	return "Name is : " + name + " , color : " + color;
}

}

class Flowering extends Plants {

private int num;

public Flowering(String name, String color, int num) {
	super(name, color);
	this.num = num;
}

public String Print() {
	return super.print() + "Number is " + num;
}

}

class Rose extends Flowering {

private int num;
private boolean fragrance;

public Rose(String color, int num, boolean fragrance) {
	super("Rose", color, num);
	this.fragrance = fragrance;

}

public String Print() {
	return super.print() + "fragrance is " + fragrance;
}

}
class Jasmine extends Flowering{
private boolean leaf;
public Jasmine( String color, int num, boolean leaf) {
	super("Jasmine", color, num);
	this.leaf = leaf;
}
public String Print() {
	return super.print() + "leaf is " + leaf;
}
}

class NonFlowering extends Plants{
private int numOfNonFlowers;
public NonFlowering(String name, String color) {
	super(name, color);
	
}
public int getNumOfNonFlowers() {
	return numOfNonFlowers;
}
public void setNumOfNonFlowers(int numOfNonFlowers) {
	this.numOfNonFlowers = numOfNonFlowers;
}
public String Print() {
	return super.print();
}

}

class Cedar extends NonFlowering{
private String parent;
public Cedar( String color, String parent) {
	super("Cedar", color);
	this.parent =parent;
}
public void printCedar() {
	System.out.println(super.Print()+", Parent is : "+parent);
}
}

class Cypress extends NonFlowering{
private String sibling;
private String parent;
public Cypress(String name, String color,String sibling, String parent) {
	super(name, color);
	this.sibling = sibling;
	this.parent = parent;
}

public void printCypress()
{
	System.out.println(super.print()+", Sibling is"+this.sibling+" , Parent is :"+this.parent);
}

}