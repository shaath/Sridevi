package com.SeleniumProject.javaprogrammes;

public class ForEg1 {

	public static void main(String[] args) 
	{
		for(int i=1; i<=100; i++)
		{
			System.out.println(i);
			if (i==75)
			{
				break;
			}
		}
		System.out.println("********");
		
		for(int j=100; j>=1; j--)
		{
			System.out.println(j);
		}

	}

}
