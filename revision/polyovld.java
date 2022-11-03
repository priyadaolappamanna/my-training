package com.obsqura.revision;
//method overloading sample program
public class polyovld {

	public static void main(String[] args) 
	{
		Add(10,20);
		Add(30,40,50);
		
	}
		public static void Add(int a, int b)//method overloading
		{
			System.out.println(a+b);
			
		}
		public static void Add(int c,int d,int e)
		{
			System.out.println(c+d+e);
			
		}

	}


