package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] x={20000,"Selenium",5000.00,'M',true};

		System.out.println(x.length);
		
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
	}

}
