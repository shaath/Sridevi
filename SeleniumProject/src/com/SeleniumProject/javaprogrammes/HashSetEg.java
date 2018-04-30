package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args) 
	{
		HashSet<String> s=new HashSet<String>();
		
		s.add("Selenium");
		s.add("Apple");
		s.add("Boll");
		s.add("Sridevi");
		s.add("Sridevi");
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String data=it.next();
			System.out.println(data);
		}
			
		

	}

}
