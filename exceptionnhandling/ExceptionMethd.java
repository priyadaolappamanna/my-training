package com.obsqura.exceptionnhandling;

public class ExceptionMethd {
	int a;
	int b;
	int c;

	public static void main(String[] args) {
		
		ExceptionMethd ob=new ExceptionMethd(10,0);
		ob.div();
			}
	
public ExceptionMethd(int a, int b)
{
	this.a=a;
	this.b=b;
}
public void div()
{
	try
	{
		c=a/b;
		System.out.println(c);
	}
	catch(Exception e)
	{
		System.out.println("some problem   "+e);
	}
}


}
