package com.obsqura.exceptionnhandling;

public class SampleExpHand 
{

	public static void main(String[] args) 
	{
		
		try
		{
		int a=10,b=0;
		int c=a/b;
		System.out.println(c);
			}
		catch(Exception e)
		{
			System.out.println("There is so problem"+e);//Arithmetic exception
		}
		
		finally
		{
			System.out.println("Printing Finally");
			
		}
		}

}
