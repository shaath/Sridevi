package com.SeleniumProject.javaprogrammes;

public class MethodsEg {

	public static void main(String[] args) {
		
		Function1();
		String res=Function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		
		m.Function3();
		boolean flag=m.Function4();
		System.out.println(flag);
	}

	//Static Method Without returning any value
	public static void Function1()
	{
		System.out.println("This is Function1 code");
	}
	//Static method with returning value
	public static String Function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	//Non static Method without returning anyvalue
	public void Function3()
	{
		System.out.println("This is Function3 code");
	}
	
	//non static methods with returning value
	public boolean Function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public double sum(double a, double b, double c)
	{
		double d=a+b+c;
		return d;	
	}
	public int sum(int a, int b,int c)
	{
		int d=a+b+c;
		return d;
	}
}
