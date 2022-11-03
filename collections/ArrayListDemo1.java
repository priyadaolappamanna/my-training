package com.obsqura.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();// declaring hetrogenous arraylist/ArrayList <Interger> ah=new ArrayList <Integer>();
		//List a=new ArrayList();upcating wih parent interface
		//add new elements
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('a');
		al.add(true);
		System.out.println(al);
		//to find how many objects are in arraylist
		System.out.println("size of arraylist is :  "+al.size());
		//to remove an item give index number
		al.remove(2);
		System.out.println("After removing from index 2"  +al);
		
		//to add an element in index 2
		al.add(2,"Priyada");
		System.out.println("After adding element in index 2"  +al);
		System.out.println("To get an element ::: "  +al.get(3));
		//to replace an element provide index number and element
		al.set(3,500);
		System.out.println("Replacing element ::"+al);
		//to search a value 
		
		System.out.println(al.contains("Priyada"));
		System.out.println(al.contains("Priyada"));
		//to check if empty or not.returns boolean value
		System.out.println(al.isEmpty());
	}

}
