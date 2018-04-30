package com.SeleniumProject.javaprogrammes;

public class StringEg {

	public static void main(String[] args) 
	{
		String name="Sridevi";
		
		System.out.println(name.length());
		
//		System.out.println(name.charAt(5));
		
//		System.out.println(name.substring(2, 6));
		
//		System.out.println(name.replace("i", "g"));
		
//		String x=name.trim();
//		System.out.println(x.length());
		
//		System.out.println(name.replaceFirst("i", "g"));
		
//		System.out.println(name.toUpperCase());
		
//		System.out.println(name.toLowerCase());
		
//		System.out.println(name.startsWith("Sr"));
		
//		System.out.println(name.endsWith("vi"));
		
//		System.out.println(name.lastIndexOf('i'));
		
//		System.out.println(name.equalsIgnoreCase("sridevi"));
		
//		System.out.println(name.contains("devs"));
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		for (int i =name.length()-1; i >=0; i--) {
			System.out.print(name.charAt(i));
		}
	}

}
