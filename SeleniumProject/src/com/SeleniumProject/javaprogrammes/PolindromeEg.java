package com.SeleniumProject.javaprogrammes;

public class PolindromeEg {

	public static void main(String[] args) 
	{
		String name="Madam";
		String Rev="";
		for (int i = name.length()-1; i >= 0; i--) 
		{
			Rev=Rev+name.charAt(i);
		}
		System.out.println(Rev);
		if (name.equalsIgnoreCase(Rev))
		{
			System.out.println("Given string is a polindrome");
		}
		else
		{
			System.out.println("Given String is not a polindrome");
		}
	}

}
