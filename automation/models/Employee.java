package com.obsqura.automation.models;

public class Employee
{
	int age;
	String name;
public Employee(int agearg,String namearg)
{
	age=agearg;
	name=namearg;
	}
public void print()
{
	System.out.println("The name is "+name+ "and age is "+age);
}
}
