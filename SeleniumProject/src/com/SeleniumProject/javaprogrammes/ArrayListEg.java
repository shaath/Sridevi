package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<Object>();
		//Writing the data into arraylist
		a.add("Selenium");
		a.add(true);
		a.add(60000);
		a.add('M');
		a.add(2, "Sridevi");
		
		//Finding the length of the arraylist
		
		System.out.println(a.size());
		
		//Reading the data from arraylist
		for (int i = 0; i < a.size(); i++) 
		{
			System.out.println(a.get(i));
		}

	}

}
