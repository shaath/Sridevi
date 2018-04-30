package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args)
	{
		String[] month={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		
		System.out.println(month.length);
		
//		System.out.println(month[5]);
		
//		for (int i = 0; i < month.length; i++) 
//		{
//			System.out.println(month[i]);
//		}
			
		for (String data : month) 
		{
			System.out.println(data);
		}

	}

}
